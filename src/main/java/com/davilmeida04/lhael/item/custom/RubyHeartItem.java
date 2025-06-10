package com.davilmeida04.lhael.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class RubyHeartItem extends Item {
    public RubyHeartItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if(!context.getWorld().isClient()) {
            PlayerEntity player = context.getPlayer();

            if (player != null) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 1));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 1));

                player.getItemCooldownManager().set(this, 1200);
            }
        }

        return super.useOnBlock(context);
    }
}
