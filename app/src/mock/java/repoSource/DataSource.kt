package repoSource

import com.google.gson.Gson
 import com.repositories.domain.model.RepositoriesModel

class DataSource {
    suspend fun getRepositories(query: String): RepositoriesModel {
        return RepositoriesModel(getMockedData().items)
    }

    private suspend fun getMockedData(): RepositoriesModel {
        return Gson().fromJson(getJsonModel(), RepositoriesModel::class.java)

    }


    private  suspend fun getJsonModel(): String {
        return "{\n" +
                "  \"total_count\": 77209,\n" +
                "  \"incomplete_results\": false,\n" +
                "  \"items\": [\n" +
                "    {\n" +
                "      \"id\": 10425992,\n" +
                "      \"node_id\": \"MDEwOlJlcG9zaXRvcnkxMDQyNTk5Mg==\",\n" +
                "      \"name\": \"css-element-queries\",\n" +
                "      \"full_name\": \"marcj/css-element-queries\",\n" +
                "      \"private\": false,\n" +
                "      \"owner\": {\n" +
                "        \"login\": \"marcj\",\n" +
                "        \"id\": 450980,\n" +
                "        \"node_id\": \"MDQ6VXNlcjQ1MDk4MA==\",\n" +
                "        \"avatar_url\": \"https://avatars0.githubusercontent.com/u/450980?v=4\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/marcj\",\n" +
                "        \"html_url\": \"https://github.com/marcj\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/marcj/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/marcj/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/marcj/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/marcj/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/marcj/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/marcj/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/marcj/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/marcj/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/marcj/received_events\",\n" +
                "        \"type\": \"User\",\n" +
                "        \"site_admin\": false\n" +
                "      },\n" +
                "      \"html_url\": \"https://github.com/marcj/css-element-queries\",\n" +
                "      \"description\": \"CSS Element-Queries aka Container Queries. High-speed element dimension/media queries in valid css.\",\n" +
                "      \"fork\": false,\n" +
                "      \"url\": \"https://api.github.com/repos/marcj/css-element-queries\",\n" +
                "      \"forks_url\": \"https://api.github.com/repos/marcj/css-element-queries/forks\",\n" +
                "      \"keys_url\": \"https://api.github.com/repos/marcj/css-element-queries/keys{/key_id}\",\n" +
                "      \"collaborators_url\": \"https://api.github.com/repos/marcj/css-element-queries/collaborators{/collaborator}\",\n" +
                "      \"teams_url\": \"https://api.github.com/repos/marcj/css-element-queries/teams\",\n" +
                "      \"hooks_url\": \"https://api.github.com/repos/marcj/css-element-queries/hooks\",\n" +
                "      \"issue_events_url\": \"https://api.github.com/repos/marcj/css-element-queries/issues/events{/number}\",\n" +
                "      \"events_url\": \"https://api.github.com/repos/marcj/css-element-queries/events\",\n" +
                "      \"assignees_url\": \"https://api.github.com/repos/marcj/css-element-queries/assignees{/user}\",\n" +
                "      \"branches_url\": \"https://api.github.com/repos/marcj/css-element-queries/branches{/branch}\",\n" +
                "      \"tags_url\": \"https://api.github.com/repos/marcj/css-element-queries/tags\",\n" +
                "      \"blobs_url\": \"https://api.github.com/repos/marcj/css-element-queries/git/blobs{/sha}\",\n" +
                "      \"git_tags_url\": \"https://api.github.com/repos/marcj/css-element-queries/git/tags{/sha}\",\n" +
                "      \"git_refs_url\": \"https://api.github.com/repos/marcj/css-element-queries/git/refs{/sha}\",\n" +
                "      \"trees_url\": \"https://api.github.com/repos/marcj/css-element-queries/git/trees{/sha}\",\n" +
                "      \"statuses_url\": \"https://api.github.com/repos/marcj/css-element-queries/statuses/{sha}\",\n" +
                "      \"languages_url\": \"https://api.github.com/repos/marcj/css-element-queries/languages\",\n" +
                "      \"stargazers_url\": \"https://api.github.com/repos/marcj/css-element-queries/stargazers\",\n" +
                "      \"contributors_url\": \"https://api.github.com/repos/marcj/css-element-queries/contributors\",\n" +
                "      \"subscribers_url\": \"https://api.github.com/repos/marcj/css-element-queries/subscribers\",\n" +
                "      \"subscription_url\": \"https://api.github.com/repos/marcj/css-element-queries/subscription\",\n" +
                "      \"commits_url\": \"https://api.github.com/repos/marcj/css-element-queries/commits{/sha}\",\n" +
                "      \"git_commits_url\": \"https://api.github.com/repos/marcj/css-element-queries/git/commits{/sha}\",\n" +
                "      \"comments_url\": \"https://api.github.com/repos/marcj/css-element-queries/comments{/number}\",\n" +
                "      \"issue_comment_url\": \"https://api.github.com/repos/marcj/css-element-queries/issues/comments{/number}\",\n" +
                "      \"contents_url\": \"https://api.github.com/repos/marcj/css-element-queries/contents/{+path}\",\n" +
                "      \"compare_url\": \"https://api.github.com/repos/marcj/css-element-queries/compare/{base}...{head}\",\n" +
                "      \"merges_url\": \"https://api.github.com/repos/marcj/css-element-queries/merges\",\n" +
                "      \"archive_url\": \"https://api.github.com/repos/marcj/css-element-queries/{archive_format}{/ref}\",\n" +
                "      \"downloads_url\": \"https://api.github.com/repos/marcj/css-element-queries/downloads\",\n" +
                "      \"issues_url\": \"https://api.github.com/repos/marcj/css-element-queries/issues{/number}\",\n" +
                "      \"pulls_url\": \"https://api.github.com/repos/marcj/css-element-queries/pulls{/number}\",\n" +
                "      \"milestones_url\": \"https://api.github.com/repos/marcj/css-element-queries/milestones{/number}\",\n" +
                "      \"notifications_url\": \"https://api.github.com/repos/marcj/css-element-queries/notifications{?since,all,participating}\",\n" +
                "      \"labels_url\": \"https://api.github.com/repos/marcj/css-element-queries/labels{/name}\",\n" +
                "      \"releases_url\": \"https://api.github.com/repos/marcj/css-element-queries/releases{/id}\",\n" +
                "      \"deployments_url\": \"https://api.github.com/repos/marcj/css-element-queries/deployments\",\n" +
                "      \"created_at\": \"2013-06-01T17:48:50Z\",\n" +
                "      \"updated_at\": \"2020-12-30T08:15:49Z\",\n" +
                "      \"pushed_at\": \"2020-08-13T03:02:50Z\",\n" +
                "      \"git_url\": \"git://github.com/marcj/css-element-queries.git\",\n" +
                "      \"ssh_url\": \"git@github.com:marcj/css-element-queries.git\",\n" +
                "      \"clone_url\": \"https://github.com/marcj/css-element-queries.git\",\n" +
                "      \"svn_url\": \"https://github.com/marcj/css-element-queries\",\n" +
                "      \"homepage\": \"http://marcj.github.io/css-element-queries/\",\n" +
                "      \"size\": 3089,\n" +
                "      \"stargazers_count\": 4027,\n" +
                "      \"watchers_count\": 4027,\n" +
                "      \"language\": \"JavaScript\",\n" +
                "      \"has_issues\": true,\n" +
                "      \"has_projects\": true,\n" +
                "      \"has_downloads\": true,\n" +
                "      \"has_wiki\": false,\n" +
                "      \"has_pages\": true,\n" +
                "      \"forks_count\": 482,\n" +
                "      \"mirror_url\": null,\n" +
                "      \"archived\": false,\n" +
                "      \"disabled\": false,\n" +
                "      \"open_issues_count\": 51,\n" +
                "      \"license\": {\n" +
                "        \"key\": \"mit\",\n" +
                "        \"name\": \"MIT License\",\n" +
                "        \"spdx_id\": \"MIT\",\n" +
                "        \"url\": \"https://api.github.com/licenses/mit\",\n" +
                "        \"node_id\": \"MDc6TGljZW5zZTEz\"\n" +
                "      },\n" +
                "      \"forks\": 482,\n" +
                "      \"open_issues\": 51,\n" +
                "      \"watchers\": 4027,\n" +
                "      \"default_branch\": \"master\",\n" +
                "      \"score\": 1.0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 23282991,\n" +
                "      \"node_id\": \"MDEwOlJlcG9zaXRvcnkyMzI4Mjk5MQ==\",\n" +
                "      \"name\": \"elasticsearch-sql\",\n" +
                "      \"full_name\": \"NLPchina/elasticsearch-sql\",\n" +
                "      \"private\": false,\n" +
                "      \"owner\": {\n" +
                "        \"login\": \"NLPchina\",\n" +
                "        \"id\": 7099924,\n" +
                "        \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjcwOTk5MjQ=\",\n" +
                "        \"avatar_url\": \"https://avatars0.githubusercontent.com/u/7099924?v=4\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/NLPchina\",\n" +
                "        \"html_url\": \"https://github.com/NLPchina\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/NLPchina/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/NLPchina/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/NLPchina/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/NLPchina/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/NLPchina/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/NLPchina/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/NLPchina/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/NLPchina/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/NLPchina/received_events\",\n" +
                "        \"type\": \"Organization\",\n" +
                "        \"site_admin\": false\n" +
                "      },\n" +
                "      \"html_url\": \"https://github.com/NLPchina/elasticsearch-sql\",\n" +
                "      \"description\": \"Use SQL to query Elasticsearch\",\n" +
                "      \"fork\": false,\n" +
                "      \"url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql\",\n" +
                "      \"forks_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/forks\",\n" +
                "      \"keys_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/keys{/key_id}\",\n" +
                "      \"collaborators_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/collaborators{/collaborator}\",\n" +
                "      \"teams_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/teams\",\n" +
                "      \"hooks_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/hooks\",\n" +
                "      \"issue_events_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/issues/events{/number}\",\n" +
                "      \"events_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/events\",\n" +
                "      \"assignees_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/assignees{/user}\",\n" +
                "      \"branches_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/branches{/branch}\",\n" +
                "      \"tags_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/tags\",\n" +
                "      \"blobs_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/git/blobs{/sha}\",\n" +
                "      \"git_tags_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/git/tags{/sha}\",\n" +
                "      \"git_refs_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/git/refs{/sha}\",\n" +
                "      \"trees_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/git/trees{/sha}\",\n" +
                "      \"statuses_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/statuses/{sha}\",\n" +
                "      \"languages_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/languages\",\n" +
                "      \"stargazers_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/stargazers\",\n" +
                "      \"contributors_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/contributors\",\n" +
                "      \"subscribers_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/subscribers\",\n" +
                "      \"subscription_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/subscription\",\n" +
                "      \"commits_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/commits{/sha}\",\n" +
                "      \"git_commits_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/git/commits{/sha}\",\n" +
                "      \"comments_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/comments{/number}\",\n" +
                "      \"issue_comment_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/issues/comments{/number}\",\n" +
                "      \"contents_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/contents/{+path}\",\n" +
                "      \"compare_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/compare/{base}...{head}\",\n" +
                "      \"merges_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/merges\",\n" +
                "      \"archive_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/{archive_format}{/ref}\",\n" +
                "      \"downloads_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/downloads\",\n" +
                "      \"issues_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/issues{/number}\",\n" +
                "      \"pulls_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/pulls{/number}\",\n" +
                "      \"milestones_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/milestones{/number}\",\n" +
                "      \"notifications_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/notifications{?since,all,participating}\",\n" +
                "      \"labels_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/labels{/name}\",\n" +
                "      \"releases_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/releases{/id}\",\n" +
                "      \"deployments_url\": \"https://api.github.com/repos/NLPchina/elasticsearch-sql/deployments\",\n" +
                "      \"created_at\": \"2014-08-24T14:26:31Z\",\n" +
                "      \"updated_at\": \"2020-12-30T09:20:48Z\",\n" +
                "      \"pushed_at\": \"2020-10-25T04:55:43Z\",\n" +
                "      \"git_url\": \"git://github.com/NLPchina/elasticsearch-sql.git\",\n" +
                "      \"ssh_url\": \"git@github.com:NLPchina/elasticsearch-sql.git\",\n" +
                "      \"clone_url\": \"https://github.com/NLPchina/elasticsearch-sql.git\",\n" +
                "      \"svn_url\": \"https://github.com/NLPchina/elasticsearch-sql\",\n" +
                "      \"homepage\": \"\",\n" +
                "      \"size\": 6159,\n" +
                "      \"stargazers_count\": 6191,\n" +
                "      \"watchers_count\": 6191,\n" +
                "      \"language\": \"Java\",\n" +
                "      \"has_issues\": true,\n" +
                "      \"has_projects\": true,\n" +
                "      \"has_downloads\": true,\n" +
                "      \"has_wiki\": true,\n" +
                "      \"has_pages\": false,\n" +
                "      \"forks_count\": 1426,\n" +
                "      \"mirror_url\": null,\n" +
                "      \"archived\": false,\n" +
                "      \"disabled\": false,\n" +
                "      \"open_issues_count\": 258,\n" +
                "      \"license\": {\n" +
                "        \"key\": \"apache-2.0\",\n" +
                "        \"name\": \"Apache License 2.0\",\n" +
                "        \"spdx_id\": \"Apache-2.0\",\n" +
                "        \"url\": \"https://api.github.com/licenses/apache-2.0\",\n" +
                "        \"node_id\": \"MDc6TGljZW5zZTI=\"\n" +
                "      },\n" +
                "      \"forks\": 1426,\n" +
                "      \"open_issues\": 258,\n" +
                "      \"watchers\": 6191,\n" +
                "      \"default_branch\": \"master\",\n" +
                "      \"score\": 1.0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 2158982,\n" +
                "      \"node_id\": \"MDEwOlJlcG9zaXRvcnkyMTU4OTgy\",\n" +
                "      \"name\": \"querydsl\",\n" +
                "      \"full_name\": \"querydsl/querydsl\",\n" +
                "      \"private\": false,\n" +
                "      \"owner\": {\n" +
                "        \"login\": \"querydsl\",\n" +
                "        \"id\": 7044479,\n" +
                "        \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjcwNDQ0Nzk=\",\n" +
                "        \"avatar_url\": \"https://avatars0.githubusercontent.com/u/7044479?v=4\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/querydsl\",\n" +
                "        \"html_url\": \"https://github.com/querydsl\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/querydsl/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/querydsl/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/querydsl/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/querydsl/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/querydsl/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/querydsl/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/querydsl/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/querydsl/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/querydsl/received_events\",\n" +
                "        \"type\": \"Organization\",\n" +
                "        \"site_admin\": false\n" +
                "      },\n" +
                "      \"html_url\": \"https://github.com/querydsl/querydsl\",\n" +
                "      \"description\": \"Unified Queries for Java\",\n" +
                "      \"fork\": false,\n" +
                "      \"url\": \"https://api.github.com/repos/querydsl/querydsl\",\n" +
                "      \"forks_url\": \"https://api.github.com/repos/querydsl/querydsl/forks\",\n" +
                "      \"keys_url\": \"https://api.github.com/repos/querydsl/querydsl/keys{/key_id}\",\n" +
                "      \"collaborators_url\": \"https://api.github.com/repos/querydsl/querydsl/collaborators{/collaborator}\",\n" +
                "      \"teams_url\": \"https://api.github.com/repos/querydsl/querydsl/teams\",\n" +
                "      \"hooks_url\": \"https://api.github.com/repos/querydsl/querydsl/hooks\",\n" +
                "      \"issue_events_url\": \"https://api.github.com/repos/querydsl/querydsl/issues/events{/number}\",\n" +
                "      \"events_url\": \"https://api.github.com/repos/querydsl/querydsl/events\",\n" +
                "      \"assignees_url\": \"https://api.github.com/repos/querydsl/querydsl/assignees{/user}\",\n" +
                "      \"branches_url\": \"https://api.github.com/repos/querydsl/querydsl/branches{/branch}\",\n" +
                "      \"tags_url\": \"https://api.github.com/repos/querydsl/querydsl/tags\",\n" +
                "      \"blobs_url\": \"https://api.github.com/repos/querydsl/querydsl/git/blobs{/sha}\",\n" +
                "      \"git_tags_url\": \"https://api.github.com/repos/querydsl/querydsl/git/tags{/sha}\",\n" +
                "      \"git_refs_url\": \"https://api.github.com/repos/querydsl/querydsl/git/refs{/sha}\",\n" +
                "      \"trees_url\": \"https://api.github.com/repos/querydsl/querydsl/git/trees{/sha}\",\n" +
                "      \"statuses_url\": \"https://api.github.com/repos/querydsl/querydsl/statuses/{sha}\",\n" +
                "      \"languages_url\": \"https://api.github.com/repos/querydsl/querydsl/languages\",\n" +
                "      \"stargazers_url\": \"https://api.github.com/repos/querydsl/querydsl/stargazers\",\n" +
                "      \"contributors_url\": \"https://api.github.com/repos/querydsl/querydsl/contributors\",\n" +
                "      \"subscribers_url\": \"https://api.github.com/repos/querydsl/querydsl/subscribers\",\n" +
                "      \"subscription_url\": \"https://api.github.com/repos/querydsl/querydsl/subscription\",\n" +
                "      \"commits_url\": \"https://api.github.com/repos/querydsl/querydsl/commits{/sha}\",\n" +
                "      \"git_commits_url\": \"https://api.github.com/repos/querydsl/querydsl/git/commits{/sha}\",\n" +
                "      \"comments_url\": \"https://api.github.com/repos/querydsl/querydsl/comments{/number}\",\n" +
                "      \"issue_comment_url\": \"https://api.github.com/repos/querydsl/querydsl/issues/comments{/number}\",\n" +
                "      \"contents_url\": \"https://api.github.com/repos/querydsl/querydsl/contents/{+path}\",\n" +
                "      \"compare_url\": \"https://api.github.com/repos/querydsl/querydsl/compare/{base}...{head}\",\n" +
                "      \"merges_url\": \"https://api.github.com/repos/querydsl/querydsl/merges\",\n" +
                "      \"archive_url\": \"https://api.github.com/repos/querydsl/querydsl/{archive_format}{/ref}\",\n" +
                "      \"downloads_url\": \"https://api.github.com/repos/querydsl/querydsl/downloads\",\n" +
                "      \"issues_url\": \"https://api.github.com/repos/querydsl/querydsl/issues{/number}\",\n" +
                "      \"pulls_url\": \"https://api.github.com/repos/querydsl/querydsl/pulls{/number}\",\n" +
                "      \"milestones_url\": \"https://api.github.com/repos/querydsl/querydsl/milestones{/number}\",\n" +
                "      \"notifications_url\": \"https://api.github.com/repos/querydsl/querydsl/notifications{?since,all,participating}\",\n" +
                "      \"labels_url\": \"https://api.github.com/repos/querydsl/querydsl/labels{/name}\",\n" +
                "      \"releases_url\": \"https://api.github.com/repos/querydsl/querydsl/releases{/id}\",\n" +
                "      \"deployments_url\": \"https://api.github.com/repos/querydsl/querydsl/deployments\",\n" +
                "      \"created_at\": \"2011-08-05T06:46:32Z\",\n" +
                "      \"updated_at\": \"2020-12-30T05:18:45Z\",\n" +
                "      \"pushed_at\": \"2020-12-30T07:48:12Z\",\n" +
                "      \"git_url\": \"git://github.com/querydsl/querydsl.git\",\n" +
                "      \"ssh_url\": \"git@github.com:querydsl/querydsl.git\",\n" +
                "      \"clone_url\": \"https://github.com/querydsl/querydsl.git\",\n" +
                "      \"svn_url\": \"https://github.com/querydsl/querydsl\",\n" +
                "      \"homepage\": \"http://www.querydsl.com\",\n" +
                "      \"size\": 50599,\n" +
                "      \"stargazers_count\": 3114,\n" +
                "      \"watchers_count\": 3114,\n" +
                "      \"language\": \"Java\",\n" +
                "      \"has_issues\": true,\n" +
                "      \"has_projects\": true,\n" +
                "      \"has_downloads\": true,\n" +
                "      \"has_wiki\": true,\n" +
                "      \"has_pages\": false,\n" +
                "      \"forks_count\": 667,\n" +
                "      \"mirror_url\": null,\n" +
                "      \"archived\": false,\n" +
                "      \"disabled\": false,\n" +
                "      \"open_issues_count\": 466,\n" +
                "      \"license\": {\n" +
                "        \"key\": \"apache-2.0\",\n" +
                "        \"name\": \"Apache License 2.0\",\n" +
                "        \"spdx_id\": \"Apache-2.0\",\n" +
                "        \"url\": \"https://api.github.com/licenses/apache-2.0\",\n" +
                "        \"node_id\": \"MDc6TGljZW5zZTI=\"\n" +
                "      },\n" +
                "      \"forks\": 667,\n" +
                "      \"open_issues\": 466,\n" +
                "      \"watchers\": 3114,\n" +
                "      \"default_branch\": \"master\",\n" +
                "      \"score\": 1.0\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 74786144,\n" +
                "      \"node_id\": \"MDEwOlJlcG9zaXRvcnk3NDc4NjE0NA==\",\n" +
                "      \"name\": \"query-server\",\n" +
                "      \"full_name\": \"fossasia/query-server\",\n" +
                "      \"private\": false,\n" +
                "      \"owner\": {\n" +
                "        \"login\": \"fossasia\",\n" +
                "        \"id\": 6295529,\n" +
                "        \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjYyOTU1Mjk=\",\n" +
                "        \"avatar_url\": \"https://avatars3.githubusercontent.com/u/6295529?v=4\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/fossasia\",\n" +
                "        \"html_url\": \"https://github.com/fossasia\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/fossasia/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/fossasia/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/fossasia/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/fossasia/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/fossasia/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/fossasia/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/fossasia/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/fossasia/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/fossasia/received_events\",\n" +
                "        \"type\": \"Organization\",\n" +
                "        \"site_admin\": false\n" +
                "      },\n" +
                "      \"html_url\": \"https://github.com/fossasia/query-server\",\n" +
                "      \"description\": \"Query Server Search Engines https://query-server.herokuapp.com\",\n" +
                "      \"fork\": false,\n" +
                "      \"url\": \"https://api.github.com/repos/fossasia/query-server\",\n" +
                "      \"forks_url\": \"https://api.github.com/repos/fossasia/query-server/forks\",\n" +
                "      \"keys_url\": \"https://api.github.com/repos/fossasia/query-server/keys{/key_id}\",\n" +
                "      \"collaborators_url\": \"https://api.github.com/repos/fossasia/query-server/collaborators{/collaborator}\",\n" +
                "      \"teams_url\": \"https://api.github.com/repos/fossasia/query-server/teams\",\n" +
                "      \"hooks_url\": \"https://api.github.com/repos/fossasia/query-server/hooks\",\n" +
                "      \"issue_events_url\": \"https://api.github.com/repos/fossasia/query-server/issues/events{/number}\",\n" +
                "      \"events_url\": \"https://api.github.com/repos/fossasia/query-server/events\",\n" +
                "      \"assignees_url\": \"https://api.github.com/repos/fossasia/query-server/assignees{/user}\",\n" +
                "      \"branches_url\": \"https://api.github.com/repos/fossasia/query-server/branches{/branch}\",\n" +
                "      \"tags_url\": \"https://api.github.com/repos/fossasia/query-server/tags\",\n" +
                "      \"blobs_url\": \"https://api.github.com/repos/fossasia/query-server/git/blobs{/sha}\",\n" +
                "      \"git_tags_url\": \"https://api.github.com/repos/fossasia/query-server/git/tags{/sha}\",\n" +
                "      \"git_refs_url\": \"https://api.github.com/repos/fossasia/query-server/git/refs{/sha}\",\n" +
                "      \"trees_url\": \"https://api.github.com/repos/fossasia/query-server/git/trees{/sha}\",\n" +
                "      \"statuses_url\": \"https://api.github.com/repos/fossasia/query-server/statuses/{sha}\",\n" +
                "      \"languages_url\": \"https://api.github.com/repos/fossasia/query-server/languages\",\n" +
                "      \"stargazers_url\": \"https://api.github.com/repos/fossasia/query-server/stargazers\",\n" +
                "      \"contributors_url\": \"https://api.github.com/repos/fossasia/query-server/contributors\",\n" +
                "      \"subscribers_url\": \"https://api.github.com/repos/fossasia/query-server/subscribers\",\n" +
                "      \"subscription_url\": \"https://api.github.com/repos/fossasia/query-server/subscription\",\n" +
                "      \"commits_url\": \"https://api.github.com/repos/fossasia/query-server/commits{/sha}\",\n" +
                "      \"git_commits_url\": \"https://api.github.com/repos/fossasia/query-server/git/commits{/sha}\",\n" +
                "      \"comments_url\": \"https://api.github.com/repos/fossasia/query-server/comments{/number}\",\n" +
                "      \"issue_comment_url\": \"https://api.github.com/repos/fossasia/query-server/issues/comments{/number}\",\n" +
                "      \"contents_url\": \"https://api.github.com/repos/fossasia/query-server/contents/{+path}\",\n" +
                "      \"compare_url\": \"https://api.github.com/repos/fossasia/query-server/compare/{base}...{head}\",\n" +
                "      \"merges_url\": \"https://api.github.com/repos/fossasia/query-server/merges\",\n" +
                "      \"archive_url\": \"https://api.github.com/repos/fossasia/query-server/{archive_format}{/ref}\",\n" +
                "      \"downloads_url\": \"https://api.github.com/repos/fossasia/query-server/downloads\",\n" +
                "      \"issues_url\": \"https://api.github.com/repos/fossasia/query-server/issues{/number}\",\n" +
                "      \"pulls_url\": \"https://api.github.com/repos/fossasia/query-server/pulls{/number}\",\n" +
                "      \"milestones_url\": \"https://api.github.com/repos/fossasia/query-server/milestones{/number}\",\n" +
                "      \"notifications_url\": \"https://api.github.com/repos/fossasia/query-server/notifications{?since,all,participating}\",\n" +
                "      \"labels_url\": \"https://api.github.com/repos/fossasia/query-server/labels{/name}\",\n" +
                "      \"releases_url\": \"https://api.github.com/repos/fossasia/query-server/releases{/id}\",\n" +
                "      \"deployments_url\": \"https://api.github.com/repos/fossasia/query-server/deployments\",\n" +
                "      \"created_at\": \"2016-11-25T20:24:01Z\",\n" +
                "      \"updated_at\": \"2020-12-29T13:02:39Z\",\n" +
                "      \"pushed_at\": \"2020-12-21T09:14:11Z\",\n" +
                "      \"git_url\": \"git://github.com/fossasia/query-server.git\",\n" +
                "      \"ssh_url\": \"git@github.com:fossasia/query-server.git\",\n" +
                "      \"clone_url\": \"https://github.com/fossasia/query-server.git\",\n" +
                "      \"svn_url\": \"https://github.com/fossasia/query-server\",\n" +
                "      \"homepage\": \"\",\n" +
                "      \"size\": 5323,\n" +
                "      \"stargazers_count\": 1426,\n" +
                "      \"watchers_count\": 1426,\n" +
                "      \"language\": \"Python\",\n" +
                "      \"has_issues\": true,\n" +
                "      \"has_projects\": false,\n" +
                "      \"has_downloads\": true,\n" +
                "      \"has_wiki\": false,\n" +
                "      \"has_pages\": false,\n" +
                "      \"forks_count\": 268,\n" +
                "      \"mirror_url\": null,\n" +
                "      \"archived\": false,\n" +
                "      \"disabled\": false,\n" +
                "      \"open_issues_count\": 32,\n" +
                "      \"license\": {\n" +
                "        \"key\": \"apache-2.0\",\n" +
                "        \"name\": \"Apache License 2.0\",\n" +
                "        \"spdx_id\": \"Apache-2.0\",\n" +
                "        \"url\": \"https://api.github.com/licenses/apache-2.0\",\n" +
                "        \"node_id\": \"MDc6TGljZW5zZTI=\"\n" +
                "      },\n" +
                "      \"forks\": 268,\n" +
                "      \"open_issues\": 32,\n" +
                "      \"watchers\": 1426,\n" +
                "      \"default_branch\": \"master\",\n" +
                "      \"score\": 1.0\n" +
                "    }\n" +
                "  ]\n" +
                "}"
    }
}