package sohi;

class ASAS {
    static int indexOf(char[] text, char[] search){
        if( search.length == 0 ) return 0;
        for (int i = 0; i < text.length; i++){
            int count = 0;
            if (text[i] == search[0]){
                for (int j = 0; j < search.length; j++){
                    if (text[i + j] == search[j])
                        count++;
                }
                if (count == search.length)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(ASAS.indexOf("HE".toCharArray(), "asdfasdf".toCharArray()));
    }
}
