/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.consumersurveys;

/**
 * Service definition for Consumersurveys (v2).
 *
 * <p>
 * API for Google Consumer Surveys.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ConsumersurveysRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Consumersurveys extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.22.0-SNAPSHOT of the Consumer Surveys API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "consumersurveys/v2/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Consumersurveys(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Consumersurveys(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Results collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Consumersurveys consumersurveys = new Consumersurveys(...);}
   *   {@code Consumersurveys.Results.List request = consumersurveys.results().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Results results() {
    return new Results();
  }

  /**
   * The "results" collection of methods.
   */
  public class Results {

    /**
     * Method for retrieving survey results.
     *
     * Create a request for the method "results.get".
     *
     * This request holds the parameters needed by the consumersurveys server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param surveyUrlId External Url Id for the survey.
     * @return the request
     */
    public Get get(java.lang.String surveyUrlId) throws java.io.IOException {
      Get result = new Get(surveyUrlId);
      initialize(result);
      return result;
    }

    public class Get extends ConsumersurveysRequest<com.google.api.services.consumersurveys.model.SurveyResults> {

      private static final String REST_PATH = "surveys/{surveyUrlId}/results";

      /**
       * Method for retrieving survey results.
       *
       * Create a request for the method "results.get".
       *
       * This request holds the parameters needed by the the consumersurveys server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param surveyUrlId External Url Id for the survey.
       * @since 1.13
       */
      protected Get(java.lang.String surveyUrlId) {
        super(Consumersurveys.this, "GET", REST_PATH, null, com.google.api.services.consumersurveys.model.SurveyResults.class);
        this.surveyUrlId = com.google.api.client.util.Preconditions.checkNotNull(surveyUrlId, "Required parameter surveyUrlId must be specified.");
        initializeMediaDownload();
      }

      @Override
      public void executeMediaAndDownloadTo(java.io.OutputStream outputStream) throws java.io.IOException {
        super.executeMediaAndDownloadTo(outputStream);
      }

      @Override
      public java.io.InputStream executeMediaAsInputStream() throws java.io.IOException {
        return super.executeMediaAsInputStream();
      }

      @Override
      public com.google.api.client.http.HttpResponse executeMedia() throws java.io.IOException {
        return super.executeMedia();
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      /** External Url Id for the survey. */
      @com.google.api.client.util.Key
      private java.lang.String surveyUrlId;

      /** External Url Id for the survey.
       */
      public java.lang.String getSurveyUrlId() {
        return surveyUrlId;
      }

      /** External Url Id for the survey. */
      public Get setSurveyUrlId(java.lang.String surveyUrlId) {
        this.surveyUrlId = surveyUrlId;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Surveys collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Consumersurveys consumersurveys = new Consumersurveys(...);}
   *   {@code Consumersurveys.Surveys.List request = consumersurveys.surveys().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Surveys surveys() {
    return new Surveys();
  }

  /**
   * The "surveys" collection of methods.
   */
  public class Surveys {

    /**
     * Method for retrieving a survey json specification, state, and cost.
     *
     * Create a request for the method "surveys.get".
     *
     * This request holds the parameters needed by the consumersurveys server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param surveyUrlId External Url Id for the survey.
     * @return the request
     */
    public Get get(java.lang.String surveyUrlId) throws java.io.IOException {
      Get result = new Get(surveyUrlId);
      initialize(result);
      return result;
    }

    public class Get extends ConsumersurveysRequest<com.google.api.services.consumersurveys.model.Survey> {

      private static final String REST_PATH = "surveys/{surveyUrlId}";

      /**
       * Method for retrieving a survey json specification, state, and cost.
       *
       * Create a request for the method "surveys.get".
       *
       * This request holds the parameters needed by the the consumersurveys server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param surveyUrlId External Url Id for the survey.
       * @since 1.13
       */
      protected Get(java.lang.String surveyUrlId) {
        super(Consumersurveys.this, "GET", REST_PATH, null, com.google.api.services.consumersurveys.model.Survey.class);
        this.surveyUrlId = com.google.api.client.util.Preconditions.checkNotNull(surveyUrlId, "Required parameter surveyUrlId must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      /** External Url Id for the survey. */
      @com.google.api.client.util.Key
      private java.lang.String surveyUrlId;

      /** External Url Id for the survey.
       */
      public java.lang.String getSurveyUrlId() {
        return surveyUrlId;
      }

      /** External Url Id for the survey. */
      public Get setSurveyUrlId(java.lang.String surveyUrlId) {
        this.surveyUrlId = surveyUrlId;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Method for creating a survey from a json specification.
     *
     * Create a request for the method "surveys.insert".
     *
     * This request holds the parameters needed by the consumersurveys server.  After setting any
     * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.consumersurveys.model.Survey}
     * @return the request
     */
    public Insert insert(com.google.api.services.consumersurveys.model.Survey content) throws java.io.IOException {
      Insert result = new Insert(content);
      initialize(result);
      return result;
    }

    public class Insert extends ConsumersurveysRequest<com.google.api.services.consumersurveys.model.Survey> {

      private static final String REST_PATH = "surveys";

      /**
       * Method for creating a survey from a json specification.
       *
       * Create a request for the method "surveys.insert".
       *
       * This request holds the parameters needed by the the consumersurveys server.  After setting any
       * optional parameters, call the {@link Insert#execute()} method to invoke the remote operation.
       * <p> {@link
       * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.consumersurveys.model.Survey}
       * @since 1.13
       */
      protected Insert(com.google.api.services.consumersurveys.model.Survey content) {
        super(Consumersurveys.this, "POST", REST_PATH, content, com.google.api.services.consumersurveys.model.Survey.class);
      }

      @Override
      public Insert setAlt(java.lang.String alt) {
        return (Insert) super.setAlt(alt);
      }

      @Override
      public Insert setFields(java.lang.String fields) {
        return (Insert) super.setFields(fields);
      }

      @Override
      public Insert setKey(java.lang.String key) {
        return (Insert) super.setKey(key);
      }

      @Override
      public Insert setOauthToken(java.lang.String oauthToken) {
        return (Insert) super.setOauthToken(oauthToken);
      }

      @Override
      public Insert setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Insert) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Insert setQuotaUser(java.lang.String quotaUser) {
        return (Insert) super.setQuotaUser(quotaUser);
      }

      @Override
      public Insert setUserIp(java.lang.String userIp) {
        return (Insert) super.setUserIp(userIp);
      }

      @Override
      public Insert set(String parameterName, Object value) {
        return (Insert) super.set(parameterName, value);
      }
    }
    /**
     * Method for listing the surveys owned by the caller.
     *
     * Create a request for the method "surveys.list".
     *
     * This request holds the parameters needed by the consumersurveys server.  After setting any
     * optional parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends ConsumersurveysRequest<com.google.api.services.consumersurveys.model.SurveysListResponse> {

      private static final String REST_PATH = "surveys";

      /**
       * Method for listing the surveys owned by the caller.
       *
       * Create a request for the method "surveys.list".
       *
       * This request holds the parameters needed by the the consumersurveys server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(Consumersurveys.this, "GET", REST_PATH, null, com.google.api.services.consumersurveys.model.SurveysListResponse.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Long maxResults;

      /**

       */
      public java.lang.Long getMaxResults() {
        return maxResults;
      }

      public List setMaxResults(java.lang.Long maxResults) {
        this.maxResults = maxResults;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.Long startIndex;

      /**

       */
      public java.lang.Long getStartIndex() {
        return startIndex;
      }

      public List setStartIndex(java.lang.Long startIndex) {
        this.startIndex = startIndex;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String token;

      /**

       */
      public java.lang.String getToken() {
        return token;
      }

      public List setToken(java.lang.String token) {
        this.token = token;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }
    /**
     * Method for starting a survey.
     *
     * Create a request for the method "surveys.start".
     *
     * This request holds the parameters needed by the consumersurveys server.  After setting any
     * optional parameters, call the {@link Start#execute()} method to invoke the remote operation.
     *
     * @param resourceId
     * @return the request
     */
    public Start start(java.lang.String resourceId) throws java.io.IOException {
      Start result = new Start(resourceId);
      initialize(result);
      return result;
    }

    public class Start extends ConsumersurveysRequest<com.google.api.services.consumersurveys.model.SurveysStartResponse> {

      private static final String REST_PATH = "surveys/{resourceId}/start";

      /**
       * Method for starting a survey.
       *
       * Create a request for the method "surveys.start".
       *
       * This request holds the parameters needed by the the consumersurveys server.  After setting any
       * optional parameters, call the {@link Start#execute()} method to invoke the remote operation.
       * <p> {@link
       * Start#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param resourceId
       * @since 1.13
       */
      protected Start(java.lang.String resourceId) {
        super(Consumersurveys.this, "POST", REST_PATH, null, com.google.api.services.consumersurveys.model.SurveysStartResponse.class);
        this.resourceId = com.google.api.client.util.Preconditions.checkNotNull(resourceId, "Required parameter resourceId must be specified.");
      }

      @Override
      public Start setAlt(java.lang.String alt) {
        return (Start) super.setAlt(alt);
      }

      @Override
      public Start setFields(java.lang.String fields) {
        return (Start) super.setFields(fields);
      }

      @Override
      public Start setKey(java.lang.String key) {
        return (Start) super.setKey(key);
      }

      @Override
      public Start setOauthToken(java.lang.String oauthToken) {
        return (Start) super.setOauthToken(oauthToken);
      }

      @Override
      public Start setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Start) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Start setQuotaUser(java.lang.String quotaUser) {
        return (Start) super.setQuotaUser(quotaUser);
      }

      @Override
      public Start setUserIp(java.lang.String userIp) {
        return (Start) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String resourceId;

      /**

       */
      public java.lang.String getResourceId() {
        return resourceId;
      }

      public Start setResourceId(java.lang.String resourceId) {
        this.resourceId = resourceId;
        return this;
      }

      @Override
      public Start set(String parameterName, Object value) {
        return (Start) super.set(parameterName, value);
      }
    }
    /**
     * Method for stopping a survey.
     *
     * Create a request for the method "surveys.stop".
     *
     * This request holds the parameters needed by the consumersurveys server.  After setting any
     * optional parameters, call the {@link Stop#execute()} method to invoke the remote operation.
     *
     * @param resourceId
     * @return the request
     */
    public Stop stop(java.lang.String resourceId) throws java.io.IOException {
      Stop result = new Stop(resourceId);
      initialize(result);
      return result;
    }

    public class Stop extends ConsumersurveysRequest<com.google.api.services.consumersurveys.model.SurveysStopResponse> {

      private static final String REST_PATH = "surveys/{resourceId}/stop";

      /**
       * Method for stopping a survey.
       *
       * Create a request for the method "surveys.stop".
       *
       * This request holds the parameters needed by the the consumersurveys server.  After setting any
       * optional parameters, call the {@link Stop#execute()} method to invoke the remote operation. <p>
       * {@link Stop#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param resourceId
       * @since 1.13
       */
      protected Stop(java.lang.String resourceId) {
        super(Consumersurveys.this, "POST", REST_PATH, null, com.google.api.services.consumersurveys.model.SurveysStopResponse.class);
        this.resourceId = com.google.api.client.util.Preconditions.checkNotNull(resourceId, "Required parameter resourceId must be specified.");
      }

      @Override
      public Stop setAlt(java.lang.String alt) {
        return (Stop) super.setAlt(alt);
      }

      @Override
      public Stop setFields(java.lang.String fields) {
        return (Stop) super.setFields(fields);
      }

      @Override
      public Stop setKey(java.lang.String key) {
        return (Stop) super.setKey(key);
      }

      @Override
      public Stop setOauthToken(java.lang.String oauthToken) {
        return (Stop) super.setOauthToken(oauthToken);
      }

      @Override
      public Stop setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Stop) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Stop setQuotaUser(java.lang.String quotaUser) {
        return (Stop) super.setQuotaUser(quotaUser);
      }

      @Override
      public Stop setUserIp(java.lang.String userIp) {
        return (Stop) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String resourceId;

      /**

       */
      public java.lang.String getResourceId() {
        return resourceId;
      }

      public Stop setResourceId(java.lang.String resourceId) {
        this.resourceId = resourceId;
        return this;
      }

      @Override
      public Stop set(String parameterName, Object value) {
        return (Stop) super.set(parameterName, value);
      }
    }
    /**
     * Method for updating a survey.
     *
     * Create a request for the method "surveys.update".
     *
     * This request holds the parameters needed by the consumersurveys server.  After setting any
     * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
     *
     * @param surveyUrlId External Url Id for the survey.
     * @param content the {@link com.google.api.services.consumersurveys.model.Survey}
     * @return the request
     */
    public Update update(java.lang.String surveyUrlId, com.google.api.services.consumersurveys.model.Survey content) throws java.io.IOException {
      Update result = new Update(surveyUrlId, content);
      initialize(result);
      return result;
    }

    public class Update extends ConsumersurveysRequest<com.google.api.services.consumersurveys.model.Survey> {

      private static final String REST_PATH = "surveys/{surveyUrlId}";

      /**
       * Method for updating a survey.
       *
       * Create a request for the method "surveys.update".
       *
       * This request holds the parameters needed by the the consumersurveys server.  After setting any
       * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
       * <p> {@link
       * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param surveyUrlId External Url Id for the survey.
       * @param content the {@link com.google.api.services.consumersurveys.model.Survey}
       * @since 1.13
       */
      protected Update(java.lang.String surveyUrlId, com.google.api.services.consumersurveys.model.Survey content) {
        super(Consumersurveys.this, "PUT", REST_PATH, content, com.google.api.services.consumersurveys.model.Survey.class);
        this.surveyUrlId = com.google.api.client.util.Preconditions.checkNotNull(surveyUrlId, "Required parameter surveyUrlId must be specified.");
      }

      @Override
      public Update setAlt(java.lang.String alt) {
        return (Update) super.setAlt(alt);
      }

      @Override
      public Update setFields(java.lang.String fields) {
        return (Update) super.setFields(fields);
      }

      @Override
      public Update setKey(java.lang.String key) {
        return (Update) super.setKey(key);
      }

      @Override
      public Update setOauthToken(java.lang.String oauthToken) {
        return (Update) super.setOauthToken(oauthToken);
      }

      @Override
      public Update setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Update) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Update setQuotaUser(java.lang.String quotaUser) {
        return (Update) super.setQuotaUser(quotaUser);
      }

      @Override
      public Update setUserIp(java.lang.String userIp) {
        return (Update) super.setUserIp(userIp);
      }

      /** External Url Id for the survey. */
      @com.google.api.client.util.Key
      private java.lang.String surveyUrlId;

      /** External Url Id for the survey.
       */
      public java.lang.String getSurveyUrlId() {
        return surveyUrlId;
      }

      /** External Url Id for the survey. */
      public Update setSurveyUrlId(java.lang.String surveyUrlId) {
        this.surveyUrlId = surveyUrlId;
        return this;
      }

      @Override
      public Update set(String parameterName, Object value) {
        return (Update) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Consumersurveys}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Consumersurveys}. */
    @Override
    public Consumersurveys build() {
      return new Consumersurveys(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ConsumersurveysRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setConsumersurveysRequestInitializer(
        ConsumersurveysRequestInitializer consumersurveysRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(consumersurveysRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
