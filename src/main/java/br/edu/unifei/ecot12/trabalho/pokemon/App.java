package br.edu.unifei.ecot12.trabalho.pokemon;

public class App {

	static void printPlayerInfo(Player player){
    	System.out.println("\nPlayer Information:");
    	System.out.println("Name: " + player.getName());
    	System.out.println("Age: " + player.getAge());
    	System.out.println("Sex: " + player.getSex());
    	System.out.println("Number of pokemon: " + player.getNumPokemon());
    	System.out.println("Number of badges: " + player.getBadges());
    	System.out.println("Money " + player.getMoney());
    	System.out.println("Pokemons: " + player.getPokemonList());
    	System.out.println("Location: " + player.getLocation());
		System.out.println("Number of itens in the backpack: " + player.getBackpack().getNumItens());
    }
	static void printTrainerInfo(Trainer trainer){
    	System.out.println("\nTrainer Information:");
    	System.out.println("Name: " + trainer.getName());
    	System.out.println("Age: " + trainer.getAge());
    	System.out.println("Number of pokemon: " + trainer.getNumPokemon());
    	System.out.println("Money " + trainer.getMoney());
    	System.out.println("Sex: " + trainer.getSex());
    	System.out.println("Type: " + trainer.getType());
    	System.out.println("Location: " + trainer.getLocation());
	}
	
	static void printQuestGiverInfo(Quest quest){
    	System.out.println("\nNPC quest Information:");
    	System.out.println("Name: " + quest.getName());
    	System.out.println("Sex: " + quest.getSex());
    	System.out.println("Location: " + quest.getLocation());
    	System.out.println("Job: " + quest.getJob());
    	System.out.println("Reward: " + quest.getReward());
	}
	
	static void printNurseInfo(Nurse nurse){
    	System.out.println("\nNPC nurse Information:");
    	System.out.println("Name: " + nurse.getName());
    	System.out.println("Sex: " + nurse.getSex());
    	System.out.println("Location: " + nurse.getLocation());
    	System.out.println("Job: " + nurse.getJob());
    	System.out.println("Has a trade PC: " + nurse.isTradePC());
    	System.out.println("Is evil: " + nurse.isBadGuy());
	}
	
	static void printSellerInfo(Seller seller){
    	System.out.println("\nNPC seller Information:");
    	System.out.println("Name: " + seller.getName());
    	System.out.println("Sex: " + seller.getSex());
    	System.out.println("Location: " + seller.getLocation());
    	System.out.println("Job: " + seller.getJob());
    	System.out.println("Size of shop: " + seller.getStoreSize());
	}
    
    static void printPokemonInfo(Pokemon pokemon){
	    System.out.println("\nPokémon Information:");
	    System.out.println(pokemon.getLifeStyle());
	    System.out.println("Name: " + pokemon.getName());
	    System.out.println("Type: " + pokemon.getType());
	    System.out.println("Level: " + pokemon.getLevel());
	    System.out.println("HP: " + pokemon.getHp());
	    System.out.println("MAX HP: " + pokemon.getMaxHp());
	    System.out.println("Evolution: " + pokemon.getEvolution());
	    System.out.println("Owner: " + pokemon.isOwner());
    }
    
    static void printCity(City city){
    	System.out.println("\nYou entered " + city.getName() +
    			", the envent: " + city.getEvent());
    }
    
    static void printRoute(Wild wild) {
    	System.out.println("\nPreRequisit: " + wild.getPreRequisit());
    	System.out.println("You entered " + wild.getRoute() +
    			", be carefull there are many pokemon level " + 
    			wild.getPokemonLevel() + " level in this area");
    }
    
	public static void main(String[] args) {
// -------------------CREATING LOCATION------------------------------
		City city1 = new City();
		city1.setGym(false);
		city1.setName("Pallet Town");
		city1.setPokemon(true);
		city1.setEvent("Trainers get their first pokemon");
		city1.setNumberNPC(12);
		
		City city2 = new City();
		city2.setGym(true);
		city2.setName("Castelia");
		city2.setPokemon(false);
		city2.setEvent("The first gym");
		city2.setNumberNPC(50);
		
		Wild route1 = new Wild();
		route1.setCommonType(TypeEnum.GRASS);
		route1.setPokemonLevel(3);
		route1.setNumberNPC(3);
		route1.setPokemon(true);
		route1.setPreRequisit("You need a pokemon to access this route");
		route1.setRoute(1);	
		
// -------------------CREATING PLAYER------------------------------
        Backpack backpack = new Backpack();
        backpack.setCapacity(10);
        backpack.setColor("red");
        backpack.setNumItens(10);
		
		Player ash = new Player();
        ash.setName("Ash Ketchum");
        ash.setSex("male");
        ash.setAge(14);
        ash.setNumPokemon(0);
        ash.setBadges(0);
        ash.setMoney(500);
        ash.setLocation(city1);
        ash.setBackpack(backpack);
        
// -------------------CREATING RIVAL------------------------------
        Trainer gary = new Trainer();
        gary.setName("Gary Oak");
        gary.setAge(15);
        gary.setNumPokemon(0);
        gary.setMoney(200);
        gary.setSex("male");
        gary.setType(TypeEnum.WATER);
        gary.setLocation(route1);
        gary.setNumPokemon(1);        
        
// -------------------CREATING NPCS------------------------------
        Quest NPCquest = new Quest();
        NPCquest.setName("Jonh");
        NPCquest.setAge(22);
        NPCquest.setSex("male");
        NPCquest.setJob("fisher");
        NPCquest.setReward("money");
        NPCquest.setLocation(city1);
        
        Nurse  NPCnurse = new Nurse();
        NPCnurse.setName("Joy");
        NPCnurse.setAge(22);
        NPCnurse.setSex("female");
        NPCnurse.setJob("nurse");
        NPCnurse.setBadGuy(false);
        NPCnurse.setTradePC(true);
        NPCnurse.setLocation(city1);
        
        Seller NPCseller = new Seller();
        NPCseller.setName("Jenny");
        NPCseller.setAge(22);
        NPCseller.setSex("female");
        NPCseller.setJob("seller");
        NPCseller.setLocation(city1);
        NPCseller.setStoreSize("Small shop");
        
// -------------------CREATING POKEMONS------------------------------
        Pokemon charmander = new Pokemon();
        charmander.setName("Charmander");
        charmander.setType(TypeEnum.FIRE);
        charmander.setLevel(5);
        charmander.setHp(20);
        charmander.setMaxHp(20);
        charmander.setEvolution(16);
        charmander.setOwner(true);
        ash.addPokemon(charmander);
        ash.setPokemon(charmander);
        
        Pokemon squirtle = new Pokemon();
        squirtle.setName("Squirtle");
        squirtle.setType(TypeEnum.WATER);
        squirtle.setLevel(10);
        squirtle.setHp(32);
        squirtle.setMaxHp(32);
        squirtle.setEvolution(16);
        squirtle.setOwner(true);

        Pokemon pikachu = new Pokemon();
        pikachu.setName("Pikachu");
        pikachu.setType(TypeEnum.ELETRIC);
        pikachu.setLevel(3);
        pikachu.setHp(16);
        pikachu.setMaxHp(16);
        pikachu.setEvolution(18);
        pikachu.setOwner(false);


  // -------------------CREATING ACTIONS------------------------------
        Capture capturePikachu = new Capture(pikachu);
        Capture captureCharmander = new Capture(charmander);
        Capture captureSquirtle= new Capture(squirtle);
        
        Attack charmanderBattle = new Attack(charmander);
        Attack pikachuBattle = new Attack(pikachu);
        
        Run charmanderRan = new Run(charmander);
        Run pikachuRan = new Run(pikachu);
        

// ----------------------------START------------------------------
        captureCharmander.performAction();
        captureSquirtle.performAction();
        
        //INTRODUCTION
        printCity(city1);
        printPlayerInfo(ash);
        printPokemonInfo(charmander);
        printTrainerInfo(gary);
        printPokemonInfo(squirtle);
        printQuestGiverInfo(NPCquest);
        printNurseInfo(NPCnurse);
        printSellerInfo(NPCseller);
        printPokemonInfo(pikachu);
        
        //QUEST
        NPCquest.giveQuest(2);
        
        //TRAINER GOING TO ROUTE1
        printRoute(route1);
        ash.setLocation(route1);
        
        //BATTLE VS RIVAL
        squirtle.challenge(charmander);
        if(charmander.getLevel()>=squirtle.getLevel()) {
	        ash.setMoney(gary.getMoney()+ash.getMoney());
	        gary.setMoney(0);
        }
        
        //CHARMANDER AFTER RIVAL BATTLE
        printPokemonInfo(charmander);
        
        //PLAYER RETURNING TO CITY TO HEAL POKEMON
        printCity(city1);
        ash.setLocation(city1);
        NPCnurse.heal(charmander);
        
        //GOIN BACK TO ROUTE1 TO GET STRONGER
        printRoute(route1);
        capturePikachu.performAction();
        System.out.println("You used a pokeball and caught a pikachu");
        backpack.setNumItens(backpack.getNumItens()-1);
        ash.addPokemon(pikachu);
        
        charmanderBattle.performAction();
        charmanderBattle.performAction();
        charmanderBattle.performAction();
        charmanderBattle.performAction();
        charmanderBattle.performAction();
        charmanderRan.performAction();
        
        pikachuRan.performAction();
        pikachuBattle.performAction();
        pikachuBattle.performAction();
        pikachuBattle.performAction();
        pikachuBattle.performAction();
        pikachuBattle.performAction();
        pikachuBattle.performAction();
        pikachuBattle.performAction();
        
     // CHALLEGING RIVAL AGAIN
        printPlayerInfo(ash);
        squirtle.challenge(charmander);
        if(charmander.getLevel()>=squirtle.getLevel()) {
	        ash.setMoney(gary.getMoney()+ash.getMoney());
	        gary.setMoney(0);
        }

      //PRINTING INFO AFTER WINNING BATTLE
        printPlayerInfo(ash);
        printPokemonInfo(charmander);
        printPokemonInfo(pikachu);
        printTrainerInfo(gary);
        printPokemonInfo(squirtle);

        //GOING BACK TO THE CITY HEAL POKEMON
        printCity(city1);
        ash.setLocation(city1);
        NPCnurse.heal(charmander);
        NPCnurse.heal(pikachu);
        printPokemonInfo(charmander);
        printPokemonInfo(pikachu);

        NPCquest.giveQuest(3);
        
        //GOING BACK TO THE WILD TO GET STRONGER
        printRoute(route1);
        ash.setLocation(route1);
        charmanderBattle.performAction();
        charmanderBattle.performAction();
        charmanderBattle.performAction();
        charmanderBattle.performAction();
        charmanderBattle.performAction();
        
        //GOING TO THE SECOND CITY TO CHALLENGE THE GYM
        printCity(city2);
        NPCquest.giveQuest(1);
        ash.setLocation(city2);
        if(charmander.getLevel()>15) {
        	System.out.println("Congratulation! You won your first badge");
        	ash.setBadges(1);
        }else {
        	System.out.println("you lost");
        }
        
        //PRINTING FINAL VERSION
        printPlayerInfo(ash);
        printPokemonInfo(charmander);
        printPokemonInfo(pikachu);

	}
}
