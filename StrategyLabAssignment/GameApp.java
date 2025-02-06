 public class GameApp {
        public static void main(String[] args) {
            
            Character knight = new Character(new SwingSword(), new Shield());
            knight.attack();
            knight.defense();
    
         
            Character wizard = new Character(new CastSpell(), new CreateMagic());
            wizard.attack();
            wizard.defense();
    
            
            Character archer = new Character(new ShootArrow(), new Dodge());
            archer.attack();
            archer.defense();
        }
    }

