package coffeeOrder;



public abstract class Coffee {
  int cost = 2000;
  String newCoffee = "americano";
	public Coffee() {
		
	}
		private String ice;
		private String bean;
		private int shot;

	   


		public String getIce() {
			return ice;
		}

		public boolean setIce(String ice) {
			
				
			
				while(ice != ice ) {
					return false;
				}
				
				this.ice = ice;
				return true;
			
			}

		public String getBean() {
			return bean;
		}

		public void setBean(String bean) {
			
			
			this.bean = bean;
		}

		public int getShot() {
			return shot; 
		}

		public void setShot(int shot) {
			if(shot == 1) {
				System.out.println("1샷 추가합니다.");
			}
			else if (shot == 2) {
			   System.out.println("2샷 추가합니다.");
			}
			else {
				System.out.println("추가하실 수 없는 샷입니다.");
				return;
			}
	        this.shot = shot;
		}

		public int cost() {
		return 	cost;
		}
		@Override
		public String toString() {
			return getIce() +"\s" +newCoffee+"\s"+ getBean()+"원두이며\s" + getShot()+"샷입니다.";
		}


	 

		
	}



