package advancedjava.finalproj.game.creature;

import advancedjava.finalproj.game.CampEnum;

import java.util.Random;

import static advancedjava.finalproj.game.creature.Utils.formatDouble;
import static advancedjava.finalproj.game.creature.Utils.limitRandomRange;

public class HuluBro extends Creature
{
    static final private double BASE_HP = 5;
    static final private double BASE_DAMAGE = 6;
    static final private double BASE_DAMAGE_RANGE = 1;
    static final private double BASE_DEFENSE = 4;
    //葫芦娃的暴击率
    static final private double BASE_CRIT_PROP = 0.4;
    static final private CampEnum CAMP = CampEnum.HULUBRO;

    private HuluBro(double hpValue, double damageValue,
                    double damageRangeValue, double defenseValue, double critPropValue)
    {
        super(hpValue, damageValue, damageRangeValue, defenseValue, critPropValue, CAMP);
    }

    static public HuluBro getInstance()
    {
        return new HuluBro(BASE_HP, BASE_DAMAGE,
                BASE_DAMAGE_RANGE, BASE_DEFENSE, BASE_CRIT_PROP);
    }

    static public HuluBro getInstance(Random rand)
    {
        double hp = BASE_HP + limitRandomRange(rand.nextDouble());
        double damage = BASE_DAMAGE + limitRandomRange(rand.nextDouble());
        double defense = BASE_DEFENSE + limitRandomRange(rand.nextDouble());
        return new HuluBro(formatDouble(hp), formatDouble(damage),
                BASE_DAMAGE_RANGE, formatDouble(defense), BASE_CRIT_PROP);
    }
}
