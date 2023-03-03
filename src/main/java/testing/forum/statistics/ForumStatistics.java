package testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageUserPosts;
    private double averageUserComments;
    private double averagePostComments;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageUserPosts() {
        return averageUserPosts;
    }

    public double getAverageUserComments() {
        return averageUserComments;
    }

    public double getAveragePostComments() {
        return averagePostComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfComments = statistics.commentsCount();
        numberOfPosts = statistics.postsCount();

        if( numberOfUsers > 0 ) {
            averageUserPosts = (double) numberOfPosts / numberOfUsers;
            averageUserComments = (double) numberOfComments / numberOfUsers;
        } else {
            averageUserPosts = 0;
            averageUserComments = 0;
        }

        if( numberOfPosts > 0 ) {
            averagePostComments = (double) numberOfComments / numberOfPosts;
        } else {
            averagePostComments = 0;
        }
    }

    public void showStatistics(){
        System.out.println("number of users: " + numberOfUsers + ", number of posts: " + numberOfPosts + ", number of comments: " + numberOfComments + "\n" +
                            "average user posts: " + averageUserPosts + ", average user comments: " + averageUserComments + ", average post comments: " + averagePostComments);
    }

}
