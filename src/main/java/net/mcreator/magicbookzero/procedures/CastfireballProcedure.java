package net.mcreator.magicbookzero.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class CastfireballProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity LookAngle = null;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new LargeFireball(EntityType.FIREBALL, _level);
			entityToSpawn.moveTo(x, y, z, 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 255), (entity.getLookAngle().y * 255), (entity.getLookAngle().z * 255));
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
