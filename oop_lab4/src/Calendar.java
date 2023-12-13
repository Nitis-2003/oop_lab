import javax.swing.JOptionPane;
public class Calendar {
    public static void main(String[] args) {
        String txt = "";
        String body = "";
        String[] cc = {"red","yellow","Fuchsia","green","#FF6600","blue","purple"};
        int col = 7;
        int x = 0;
        int st = 2;

        for(int i=1;i<=31+st;i++){
            if (i<=st) {
                txt += "<th bgcolor='brown'></th>";
            }else{
                x++;
                txt += "<th bgcolor='"+cc[i%cc.length]+"'>"+x+"</th>";
            }
            if(i%col==0){
                body+="<tr>"+txt+"</tr>";
                txt ="";
            }
        }
        if((x+st)%col!=0){
            body += "<tr>"+txt+"<td bgcolor='black' colspan='"+(col-(x+st)%col)+"'></td><tr>";
        }
        txt = "<html>"+
              "<table border ='1'>"+
              "<tr><th colspan=7>Month Calendar</th></tr>"+
              body+
              "</table>"+
              "</html>";
        JOptionPane.showMessageDialog(null, txt);
    }
}
