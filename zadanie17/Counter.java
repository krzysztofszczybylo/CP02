
public class Counter
{
    int initialValue = 0;
    int lastValue;
    
    void Reset(){
        System.out.println(initialValue = 0);
    };
    void Count(){
        
            if (lastValue > 0){
                for (initialValue = 0; (initialValue-lastValue) < 11; initialValue = initialValue+10){
                    System.out.println(initialValue);
                    if ((lastValue - initialValue) < 10){
                        for (initialValue = initialValue; initialValue <= lastValue; initialValue++){
                            
                                System.out.println(initialValue);
                                
                            }
                        }
                        
                    }
                    

                } else {
                    for (initialValue = 0; (initialValue-lastValue) >= -10; initialValue = initialValue-10){
                    System.out.println(initialValue);
                    if ((lastValue - initialValue) < 10){
                        for (initialValue = initialValue; initialValue >= lastValue; initialValue--){
                            
                                System.out.println(initialValue);
                                
                    
                        }
                
                    
                    }
                
                
        
                    }
                }
            }
        }
