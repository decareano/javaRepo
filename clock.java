public void tick(int numberOfSeconds) {
        seconds += numberOfSeconds;
        //resolving edge cases with single digits
        if (hours < 10 || minutes < 10 || seconds < 10) {
          // add a zero in front as in:
          // int x = Integer.parseInt("0");
          // I am stuck here...
           
        }
        
        if (seconds >= 60) {
          minutes += seconds / 60;
          seconds = seconds % 60;
        } 
        
        if (minutes >= 60) {
          hours += minutes / 60;
          minutes = minutes % 60;
        } 
          //188 seconds i will divide 188 / 60 = 3 minutes
          //add 3 minutes to the minutes
          //need to add the reminder to the seconds via modulo
          //188 % 8 = 8 seconds 
          
          //if minutes are greater than 60 then minutes /60 = hours

          
          
    }
