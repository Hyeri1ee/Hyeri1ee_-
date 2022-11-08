public class KCluster extends Weight{

           public int num;

         
           public KCluster(int length, boolean rnd, int num) {
			super(length, rnd);
			this.num = num;
		}



		public int getNumber(){

                     return num;

           }

          

           public void setWeight(Weight w){

                    value = w.value;

           }

}