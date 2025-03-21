package mdteam.ait.client.animation.console.hartnell;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class HartnellAnimations {
    public static final Animation ROTOR = Animation.Builder.create(3.4f).looping()
            .addBoneAnimation("rotor",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.68f, AnimationHelper.createTranslationalVector(0f, -4f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(3.36f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("compass",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.68f, AnimationHelper.createRotationalVector(0f, 180f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(3.36f, AnimationHelper.createRotationalVector(0f, 360f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
}
