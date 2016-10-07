General notes

1. Create a service account via the Google Developer Console
  - Go to https://console.developers.google.com/apis/credentials
  - Create credentials => Service account key
  - Select .p12 as key format
  - Rename the downloaded file as key.p12 and place in the same directory as
    Program.cs
2. Build project - should generate a file named `ConsumerSurveysSample.exe`
3. Run command
  - Create: `ConsumerSurveysSample.exe -o=create
    -oe=<OWNER_EMAIL>
    -oe=<SERVICE_ACCOUNT_EMAIL>
    -se=<SERVICE_ACCOUNT_EMAIL>`
    - Note that both the survey owner email and service account email need to be
      included for survey creation
  - Fetch: `ConsumerSurveysSample.exe -o=fetch
    -se=<SERVICE_ACCOUNT_EMAIL>
    -si=<SURVEY_ID>`
