package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview movieReview1 = new MovieReview();
        movieReviews[0] = movieReview1;
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";
        System.out.println("영화 제목: " + movieReviews[0].title + ", 리뷰: " + movieReviews[0].review);

        MovieReview movieReview2 = new MovieReview();
        movieReviews[1] = movieReview2;
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";
        System.out.println("영화 제목: " + movieReviews[1].title + ", 리뷰: " + movieReviews[1].review);

    }
}
