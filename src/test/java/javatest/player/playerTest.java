package javatest.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class playerTest {

    @Test
    public void looses_when_dice_number_is_too_low(){
        //Dice dice =new Dice(6);
        Dice dice=Mockito.mock(Dice.class);//simula la clase "dice"
        Mockito.when(dice.roll()).thenReturn(2);//cuando se ejecute el metodo "roll" de la clase "dice" devuelva un "2"
        Player player=new Player(dice,3);
        assertEquals(false,player.play());
    }

    @Test
    public void wins_when_dice_number_is_big(){
        //Dice dice =new Dice(6);
        Dice dice=Mockito.mock(Dice.class);//simula la clase "dice"
        Mockito.when(dice.roll()).thenReturn(4);//cuando se ejecute el metodo "roll" de la clase "dice" devuelva un "2"
        Player player=new Player(dice,3);
        assertEquals(true,player.play());
    }

}