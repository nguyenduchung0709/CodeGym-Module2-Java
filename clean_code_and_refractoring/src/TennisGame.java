

public class TennisGame {
    public static final String LOVE = "LOVE";
    public static final String FIFTEEN = "FIFTEEN";
    public static final String THIRTY = "THIRTY";
    public static final String FORTY = "FORTY";


    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {

        if (player1Score == player2Score) {
            return getEqualScores(player1Score);
        }

        if (player1Score >= 4 || player2Score >= 4) {
            return getWinScore(player1Score, player2Score);
        }
        return getNormalScore(player1Score, player2Score);
    }

    private static String getWinScore(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            return "Advantage for player 1";
        } else if (minusResult == -1) {
            return "Advantage for player 2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }

    }

    public static String getEqualScores(int points) {
        switch (points) {
            case 0:
                return LOVE + "-ALL";
            case 1:
                return FIFTEEN + "-ALL";
            case 2:
                return THIRTY + "-ALL";
            case 3:
                return FORTY + "-ALL";
            default:
                return "Deuce";


        }

    }

    private static String getNormalScore(int player1Score, int player2Score) {
        return getPointDescription(player1Score) + "-" + getPointDescription(player2Score);
    }

    private static String getPointDescription(int points) {
        switch (points) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                throw new IllegalArgumentException("INVALID POINTS: " + points);
        }
    }
}