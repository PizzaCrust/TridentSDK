/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2014 The TridentSDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tridentsdk.effect.entity;

/**
 * Enum of all possible entity effects
 *
 * @author The TridentSDK Team
 * @since 0.4-alpha
 */
public enum EntityStatusEffectType {
    /**
     * When an entity gets hurt
     */
    HURT((byte) 2),

    /**
     * When an Entity dies
     *
     * This can cause de-sync and client glitches!
     */
    DEATH((byte) 3),

    /**
     * The smoke when taming a Wolf/Ocelot/Horse fails
     *
     * The effect will not apply unless the entity is a Wolf/Ocelot/Horse
     */
    PET_SMOKE((byte) 6),

    /**
     * The hearts when taming a Wolf/Ocelot/Horse succeeds
     *
     * The effect will not apply unless the entity is a Wolf/Ocelot/Horse
     */
    PET_HEARTS((byte) 7),

    /**
     * When a Wolf shakes after being wet
     *
     * The effect will not apply unless the entity is a Wolf/Ocelot/Horse
     */
    WOLF_SHAKE((byte) 8),

    /**
     * When a Sheep eats a long grass block.
     */
    SHEEP_EAT((byte) 10),

    /**
     * When an Iron Golem gives a rose
     *
     * The effect will not apply unless the entity is an Iron Golem
     */
    IRON_GOLEM_ROSE((byte) 11),

    /**
     * Hearts from a Villager when he is in "Love Mode"
     *
     * The effect will not apply unless the entity is a Villager
     */
    VILLAGER_HEART((byte) 12),

    /**
     * Storm Cloud from a Villager when he is Angry
     *
     * The effect will not apply unless the entity is a Villager
     */
    VILLAGER_ANGRY((byte) 13),

    /**
     * Green Star particles from a villager when he is Happy
     *
     * The effect will not apply unless the entity is a Villager
     */
    VILLAGER_HAPPY((byte) 14),

    /**
     * Magic particles from a witch.
     *
     * The effect will not apply unless the entity is a Witch
     */
    WITCH_MAGIC((byte) 15),

    /**
     * When a Zombie transforms into a villager by shaking violently
     *
     * The effect will not apply unless the entity is a Zombie
     */
    ZOMBIE_TRANSFORM((byte) 16),

    /**
     * When a Firework explodes.
     *
     * The effect will not apply unless the entity is a Firework
     */
    FIREWORK_EXPLODE((byte) 17),

    /**
     * Love Particles when an Animal is in love.
     *
     * The effect will not apply unless the entity is an Animal
     */
    ANIMAL_LOVE((byte) 18),

    /**
     * Reset the squid rotation
     *
     * The effect will not apply unless the entity is a Squid
     */
    RESET_SQUID((byte) 19),

    /**
     * Just an explosion
     *
     * The effect only works on some entities
     */
    EXPLOSION((byte) 20),

    /**
     * The guardian sound
     */
    GUARDIAN((byte) 21),

    /**
     * Reduce the players debug by hiding the location information
     *
     * The effect will not apply unless the entity is a Player
     */
    REDUCE_DEBUG((byte) 22),

    /**
     * Reset the players debug by showing the location information
     *
     * The effect will not apply unless the entity is a Player
     */
    RESET_DEBUG((byte) 23);

    private final byte id;

    EntityStatusEffectType(byte id) {
        this.id = id;
    }

    /**
     * Get the id value of the effect
     *
     * @return The id value of the effect
     */
    public byte id(){
        return id;
    }
}
