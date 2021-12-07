/*
Write a method called getGrade that accepts an integer representing a student's grade in a course and returns that student's numerical course grade. 
The grade can be between 0.0 (failing) and 4.0 (perfect). Assume that scores are in the range of 0 to 100 and that grades are based on the following scale:

Score	Grade
<60	    0.0
60-62	  0.7
63	    0.8
64	    0.9
65	    1.0
...	
92	    3.7
93	    3.8
94	    3.9
>=95	  4.0
For an added challenge, make your method throw an IllegalArgumentException if the user passes a grade lower than 0 or higher than 100.
*/

public static double getGrade(int score) {
    double result = 0;
    if(score < 0 || score > 100) {
		throw new IllegalArgumentException();
			
	} else if(score < 60) {
		result = 0.0;
	} else if(score >= 60 && score < 62) {
		result = 0.7;
	} else if(score >= 63 && score < 95) {
		result += 0.8 + (score - 63) * 0.1;
	} else if(score >= 95 && score <= 100) {
		result = 4.0;
	} else {
		result = 0;
	}
    return result;
}
