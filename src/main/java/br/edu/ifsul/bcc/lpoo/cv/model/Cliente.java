package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cliente extends Pessoa{

    private Calendar data_ultima_visita;

    private List<Pet> pets; //agregacao

}
