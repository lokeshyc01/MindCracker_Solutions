class Solution {
public:
    int minMovesToSeat(vector<int>& seats, vector<int>& students) {
       int moves = 0;
        int n = seats.size();
       vector<int> seats_position(101,0);
       vector<int> student_position(101,0);

       for(int &p:seats){
        seats_position[p]++;
       }

       for(int &p : students)
       {
        student_position[p]++;
       }

        int i = 0,j = 0;

        while(n > 0){
            if(seats_position[i] == 0) i++;
            if(student_position[j] == 0) j++;

            if(seats_position[i] != 0 && student_position[j] != 0)
            {
                moves += abs(i - j);
                seats_position[i]--;
                student_position[j]--;
                n--;
               
            }
        }

        return moves;
    }
};
