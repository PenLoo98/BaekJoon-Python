import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13717 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int totalRevolutions = 0; // 진화시킬 수 있는 총 마리수
        String maxRevolutionPokemon = ""; // 진화시킬 수 있는 총 마리수 중 가장 많은 진화를 한 포켓몬의 이름
        int maxRevolution = 0; // 진화시킬 수 있는 총 마리수 중 가장 많은 진화를 한 포켓몬의 진화수
        StringTokenizer st;

        for(int i=0;i<n;i++){
            int currentRevolution = 0; // 현재 포켓몬의 진화수
            String name = br.readLine(); // 현재 포켓몬 이름
            st = new StringTokenizer(br.readLine(), " ");
            int needCandy = Integer.parseInt(st.nextToken()); // 진화에 필요한 사탕의 수
            int totalCandy = Integer.parseInt(st.nextToken()); // 가지고 있는 총 사탕의 수
            while(totalCandy >= needCandy){
                totalRevolutions++;
                currentRevolution++;
                totalCandy -= needCandy;
                totalCandy+=2;
            }
            // 가장 많은 진화를 한 포켓몬의 진화수와 이름을 저장
            if(currentRevolution > maxRevolution){
                maxRevolution = currentRevolution;
                maxRevolutionPokemon = name;
            }
        }
        System.out.println(totalRevolutions+"\n"+maxRevolutionPokemon);
    }
}
