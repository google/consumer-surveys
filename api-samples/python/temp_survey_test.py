import unittest

from googleapiclient.errors import HttpError

from create_survey import create_survey
from oauth import get_service_account_auth


class TestSurvey(unittest.TestCase):

    def test_create_survey_with_invalid_email(self):
        with self.assertRaises(HttpError):
            create_survey(get_service_account_auth(), 'invalid')


if __name__ == '__main__':
    unittest.main()
