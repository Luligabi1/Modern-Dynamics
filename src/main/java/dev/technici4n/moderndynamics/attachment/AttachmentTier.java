/*
 * Modern Dynamics
 * Copyright (C) 2021 shartte & Technici4n
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package dev.technici4n.moderndynamics.attachment;

import net.minecraft.world.item.Rarity;

public enum AttachmentTier {
    BASIC(3, 4, 40, 1, Rarity.COMMON),
    IMPROVED(9, 16, 20, 2, Rarity.UNCOMMON),
    ADVANCED(15, 64, 10, 3, Rarity.RARE),
    ;

    public final int filterSize;
    public final int transferCount;
    public final int transferFrequency;
    public final int speedupFactor;
    public final Rarity rarity;

    AttachmentTier(int filterSize, int transferCount, int transferFrequency, int speedupFactor, Rarity rarity) {
        this.filterSize = filterSize;
        this.transferCount = transferCount;
        this.transferFrequency = transferFrequency;
        this.speedupFactor = speedupFactor;
        this.rarity = rarity;
    }

    public boolean allowAdvancedBehavior() {
        return this == ADVANCED;
    }
}
