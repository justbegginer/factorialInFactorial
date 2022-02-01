public class EndlessInteger {
    private String integer;
    public EndlessInteger(String integer){
        this.integer = integer;
    }

    public void sum(EndlessInteger another) {
        String first = "";
        String second = "";
        if (this.integer.length() > another.integer.length()){
            first = this.integer;
            second = another.integer;
        }
        else{
            first = another.integer;
            second = this.integer;
        }
        String temp = "";
        for (int i = first.length()-1; i >= 0; i--) {
            temp += first.charAt(i);
        }
        first = temp;
        temp = "";
        for (int i = second.length()-1; i >= 0; i--) {
            temp += second.charAt(i);
        }
        second = temp;
        this.integer = "";
        String ost = "";
        for (int i = 0; i < first.length(); i++) {
            String numberToConcatenate = "";
            if (ost.length() == 0)
                ost = "0";
            if (second.length()<= i){
                numberToConcatenate = Integer.toString(Integer.parseInt(Character.toString(first.charAt(i))) +
                        Integer.parseInt(ost));
            }
            else{
                numberToConcatenate = Integer.toString(Integer.parseInt(Character.toString(first.charAt(i))) +
                        Integer.parseInt(Character.toString(second.charAt(i))) +
                        Integer.parseInt(ost));
            }
            if (numberToConcatenate.length() > 1){
                ost = Character.toString(numberToConcatenate.charAt(0));
                this.integer += Character.toString(numberToConcatenate.charAt(1));
            }
            else{
                this.integer += Character.toString(numberToConcatenate.charAt(0));
                ost = "0";
            }
        }
        if(!ost.equals("0")){
            this.integer = ost + this.integer;
        }
        temp = "";
        for (int i = this.integer.length()-1; i >= 0; i--) {
            temp += this.integer.charAt(i);
        }
        this.integer = temp;
    }
    public void multiply(EndlessInteger another){

    }

    public String getInteger() {
        return integer;
    }
}
