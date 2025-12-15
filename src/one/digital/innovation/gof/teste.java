package one.digital.innovation.gof;

import one.digital.innovation.gof.facade.Facade;
import one.digital.innovation.gof.singleton.SingletonEager;
import one.digital.innovation.gof.singleton.SingletonLazy;
import one.digital.innovation.gof.singleton.SingletonLazyHolder;
import one.digital.innovation.gof.strategy.*;

public class teste {
    public static void main(String[] args) {

        //TESTE RELACIONADOS AO DESIGN PATTERN SINGLETON


        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //STRATEGY

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();


        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();


        // facade

        Facade facade = new Facade();
        facade.migrarCliente("Gustavson", "55540000");








    }
}
