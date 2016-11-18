#!/usr/bin/env python2.7

import os

import httplib2
from googleapiclient.discovery import build_from_document
from oauth2client import clientsecrets
from oauth2client.service_account import ServiceAccountCredentials

ACCOUNT_SECRET = 'account_secret.json'
API_DISCOVERY_FILE = "consumersurveys_v2_discovery.json"
SCOPES = [
    'https://www.googleapis.com/auth/consumersurveys',
    'https://www.googleapis.com/auth/consumersurveys.readonly',
    'https://www.googleapis.com/auth/userinfo.email',
]


def setup_auth():
    """Set up and authenticate HTTP client library.

    Returns:
        An HTTP client library with authentication enabled.
    """
    credentials = ServiceAccountCredentials.from_json_keyfile_name(ACCOUNT_SECRET, SCOPES)
    http = httplib2.Http()
    return credentials.authorize(http)


def get_service_account_auth():
    try:
        auth_http = setup_auth()
    except clientsecrets.InvalidClientSecretsError, e:
        print ('Unable to setup authorization with the given credentials.  %s'
               % e)
        return

    # Load the local copy of the discovery document
    f = file(os.path.join(os.path.dirname(__file__), API_DISCOVERY_FILE), "r")
    discovery_file = f.read()
    f.close()

    # Construct a service from the local documents
    try:
        service = build_from_document(service=discovery_file, http=auth_http)
    except ValueError, e:
        print 'Error parsing discovery file "%s": %s' % (f.name, e)
        return

    return service
