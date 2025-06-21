package at.areatitles.mixin;


import net.minecraft.util.math.BlockPos; //block pos 2338
import net.minecraft.block.AbstractSignBlock; //sign block 2478
import net.minecraft.block.BlockState; //block state 2680
import net.minecraft.server.world.ServerWorld; //server level 3218
import net.minecraft.block.AbstractBlock; //block behaviour 4970




import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "onStateReplaced")
	//private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadWorld()V


 //@Mixin({class_4970.class})


   private void  onStateReplaced(AbstractBlock state, ServerWorld world, BlockPos pos, boolean moved, CallbackInfo ci) {
      
      }
   }

