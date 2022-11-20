// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import android.view.MotionEvent;
import java.util.concurrent.CancellationException;
import com.google.android.filament.TransformManager;
import com.google.android.filament.RenderableManager;
import java.util.Collection;
import java.util.HashMap;
import android.view.View$OnAttachStateChangeListener;
import java.nio.Buffer;
import com.google.android.filament.LightManager$Builder;
import com.google.android.filament.LightManager$Type;
import com.google.android.filament.Colors;
import com.google.android.filament.gltfio.MaterialProvider;
import com.google.android.filament.EntityManager;
import com.google.android.filament.gltfio.UbershaderLoader;
import com.google.android.filament.android.UiHelper$ContextErrorPolicy;
import com.google.android.filament.android.UiHelper$RendererCallback;
import com.google.android.filament.View;
import com.google.android.filament.android.UiHelper;
import android.view.TextureView;
import com.google.android.filament.SwapChain;
import android.view.SurfaceView;
import com.google.android.filament.Scene;
import com.google.android.filament.gltfio.ResourceLoader;
import com.google.android.filament.Renderer;
import com.google.android.filament.Entity;
import com.google.android.filament.Engine;
import com.google.android.filament.android.DisplayHelper;
import com.google.android.filament.Camera;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.Animator;
import kotlin.Metadata;
import android.view.View$OnTouchListener;

@Metadata(bv = {}, d1 = { "\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0010\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0087\u0001\u0088\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001B4\b\u0016\u0012\u0006\u0010h\u001a\u00020g\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010a¢\u0006\u0006\b\u0082\u0001\u0010\u0085\u0001B4\b\u0016\u0012\u0006\u0010k\u001a\u00020j\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010a¢\u0006\u0006\b\u0082\u0001\u0010\u0086\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bJ$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tJ\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0010\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00102\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010;\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u00107R*\u0010@\u001a\u00020>2\u0006\u0010?\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0017\u0010G\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0007\u001a\u00020K8\u0006¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010U\u001a\u00020T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010Z\u001a\u00020Y8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010{R\u0014\u0010}\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010{R\u0019\u0010\u0081\u0001\u001a\u00020>8F¢\u0006\r\u0012\u0005\b\u007f\u0010\u0080\u0001\u001a\u0004\b~\u0010C\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001" }, d2 = { "Lcom/google/android/filament/utils/ModelViewer;", "Landroid/view/View$OnTouchListener;", "Lcom/google/android/filament/gltfio/FilamentAsset;", "asset", "Lfzv;", "populateScene", "Landroid/view/View;", "view", "addDetachListener", "Lkotlin/Function1;", "", "Ljava/nio/Buffer;", "callback", "fetchResources", "(Lcom/google/android/filament/gltfio/FilamentAsset;Lqsb;Lgo6;)Ljava/lang/Object;", "updateCameraProjection", "buffer", "loadModelGlb", "loadModelGltf", "loadModelGltfAsync", "Lcom/google/android/filament/utils/Float3;", "centerPoint", "transformToUnitCube", "clearRootTransform", "destroyModel", "", "frameTimeNanos", "render", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "", "onTouch", "Lcom/google/android/filament/Engine;", "engine", "Lcom/google/android/filament/Engine;", "getEngine", "()Lcom/google/android/filament/Engine;", "Lcom/google/android/filament/android/UiHelper;", "uiHelper", "Lcom/google/android/filament/android/UiHelper;", "<set-?>", "Lcom/google/android/filament/gltfio/FilamentAsset;", "getAsset", "()Lcom/google/android/filament/gltfio/FilamentAsset;", "Lcom/google/android/filament/gltfio/Animator;", "animator", "Lcom/google/android/filament/gltfio/Animator;", "getAnimator", "()Lcom/google/android/filament/gltfio/Animator;", "normalizeSkinningWeights", "Z", "getNormalizeSkinningWeights", "()Z", "setNormalizeSkinningWeights", "(Z)V", "recomputeBoundingBoxes", "getRecomputeBoundingBoxes", "setRecomputeBoundingBoxes", "ignoreBindTransform", "getIgnoreBindTransform", "setIgnoreBindTransform", "", "value", "cameraFocalLength", "F", "getCameraFocalLength", "()F", "setCameraFocalLength", "(F)V", "Lcom/google/android/filament/Scene;", "scene", "Lcom/google/android/filament/Scene;", "getScene", "()Lcom/google/android/filament/Scene;", "Lcom/google/android/filament/View;", "Lcom/google/android/filament/View;", "getView", "()Lcom/google/android/filament/View;", "Lcom/google/android/filament/Camera;", "camera", "Lcom/google/android/filament/Camera;", "getCamera", "()Lcom/google/android/filament/Camera;", "Lcom/google/android/filament/Renderer;", "renderer", "Lcom/google/android/filament/Renderer;", "getRenderer", "()Lcom/google/android/filament/Renderer;", "", "light", "I", "getLight", "()I", "Lcom/google/android/filament/android/DisplayHelper;", "displayHelper", "Lcom/google/android/filament/android/DisplayHelper;", "Lcom/google/android/filament/utils/Manipulator;", "cameraManipulator", "Lcom/google/android/filament/utils/Manipulator;", "Lcom/google/android/filament/utils/GestureDetector;", "gestureDetector", "Lcom/google/android/filament/utils/GestureDetector;", "Landroid/view/SurfaceView;", "surfaceView", "Landroid/view/SurfaceView;", "Landroid/view/TextureView;", "textureView", "Landroid/view/TextureView;", "Lcom/google/android/filament/SwapChain;", "swapChain", "Lcom/google/android/filament/SwapChain;", "Lcom/google/android/filament/gltfio/AssetLoader;", "assetLoader", "Lcom/google/android/filament/gltfio/AssetLoader;", "Lcom/google/android/filament/gltfio/ResourceLoader;", "resourceLoader", "Lcom/google/android/filament/gltfio/ResourceLoader;", "", "readyRenderables", "[I", "", "eyePos", "[D", "target", "upward", "getProgress", "getProgress$annotations", "()V", "progress", "<init>", "(Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;)V", "manipulator", "(Landroid/view/SurfaceView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V", "(Landroid/view/TextureView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V", "Companion", "SurfaceCallback", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 })
public final class ModelViewer implements View$OnTouchListener
{
    public static final Companion Companion;
    private static final Float3 kDefaultObjectPosition;
    private Animator animator;
    private FilamentAsset asset;
    private AssetLoader assetLoader;
    private final Camera camera;
    private float cameraFocalLength;
    private Manipulator cameraManipulator;
    private DisplayHelper displayHelper;
    private final Engine engine;
    private final double[] eyePos;
    private k9e fetchResourcesJob;
    private GestureDetector gestureDetector;
    private boolean ignoreBindTransform;
    @Entity
    private final int light;
    private boolean normalizeSkinningWeights;
    private final int[] readyRenderables;
    private boolean recomputeBoundingBoxes;
    private final Renderer renderer;
    private ResourceLoader resourceLoader;
    private final Scene scene;
    private SurfaceView surfaceView;
    private SwapChain swapChain;
    private final double[] target;
    private TextureView textureView;
    private final UiHelper uiHelper;
    private final double[] upward;
    private final View view;
    
    static {
        Companion = new Companion(null);
        kDefaultObjectPosition = new Float3(0.0f, 0.0f, -4.0f);
    }
    
    public ModelViewer(final SurfaceView surfaceView, final Engine engine, final UiHelper uiHelper, final Manipulator manipulator) {
        czd.f((Object)surfaceView, "surfaceView");
        czd.f((Object)engine, "engine");
        czd.f((Object)uiHelper, "uiHelper");
        this(engine, uiHelper);
        Manipulator build = manipulator;
        if (manipulator == null) {
            final Manipulator.Builder builder = new Manipulator.Builder();
            final Float3 kDefaultObjectPosition = ModelViewer.kDefaultObjectPosition;
            build = builder.targetPosition(kDefaultObjectPosition.getX(), kDefaultObjectPosition.getY(), kDefaultObjectPosition.getZ()).viewport(((android.view.View)surfaceView).getWidth(), ((android.view.View)surfaceView).getHeight()).build(Manipulator.Mode.ORBIT);
            czd.e((Object)build, "Builder()\n              \u2026d(Manipulator.Mode.ORBIT)");
        }
        this.cameraManipulator = build;
        this.surfaceView = surfaceView;
        this.gestureDetector = new GestureDetector((android.view.View)surfaceView, build);
        this.displayHelper = new DisplayHelper(((android.view.View)surfaceView).getContext());
        uiHelper.setRenderCallback((UiHelper$RendererCallback)new ModelViewer.ModelViewer$SurfaceCallback(this));
        uiHelper.attachTo(surfaceView);
        this.addDetachListener((android.view.View)surfaceView);
    }
    
    public ModelViewer(final SurfaceView surfaceView, Engine create, UiHelper uiHelper, Manipulator manipulator, final int n, final rf8 rf8) {
        if ((n & 0x2) != 0x0) {
            create = Engine.create();
            czd.e((Object)create, "create()");
        }
        if ((n & 0x4) != 0x0) {
            uiHelper = new UiHelper(UiHelper$ContextErrorPolicy.DONT_CHECK);
        }
        if ((n & 0x8) != 0x0) {
            manipulator = null;
        }
        this(surfaceView, create, uiHelper, manipulator);
    }
    
    public ModelViewer(final TextureView textureView, final Engine engine, final UiHelper uiHelper, final Manipulator manipulator) {
        czd.f((Object)textureView, "textureView");
        czd.f((Object)engine, "engine");
        czd.f((Object)uiHelper, "uiHelper");
        this(engine, uiHelper);
        Manipulator build = manipulator;
        if (manipulator == null) {
            final Manipulator.Builder builder = new Manipulator.Builder();
            final Float3 kDefaultObjectPosition = ModelViewer.kDefaultObjectPosition;
            build = builder.targetPosition(kDefaultObjectPosition.getX(), kDefaultObjectPosition.getY(), kDefaultObjectPosition.getZ()).viewport(((android.view.View)textureView).getWidth(), ((android.view.View)textureView).getHeight()).build(Manipulator.Mode.ORBIT);
            czd.e((Object)build, "Builder()\n              \u2026d(Manipulator.Mode.ORBIT)");
        }
        this.cameraManipulator = build;
        this.textureView = textureView;
        this.gestureDetector = new GestureDetector((android.view.View)textureView, build);
        this.displayHelper = new DisplayHelper(((android.view.View)textureView).getContext());
        uiHelper.setRenderCallback((UiHelper$RendererCallback)new ModelViewer.ModelViewer$SurfaceCallback(this));
        uiHelper.attachTo(textureView);
        this.addDetachListener((android.view.View)textureView);
    }
    
    public ModelViewer(final TextureView textureView, Engine create, UiHelper uiHelper, Manipulator manipulator, final int n, final rf8 rf8) {
        if ((n & 0x2) != 0x0) {
            create = Engine.create();
            czd.e((Object)create, "create()");
        }
        if ((n & 0x4) != 0x0) {
            uiHelper = new UiHelper(UiHelper$ContextErrorPolicy.DONT_CHECK);
        }
        if ((n & 0x8) != 0x0) {
            manipulator = null;
        }
        this(textureView, create, uiHelper, manipulator);
    }
    
    public ModelViewer(final Engine engine, final UiHelper uiHelper) {
        czd.f((Object)engine, "engine");
        czd.f((Object)uiHelper, "uiHelper");
        this.engine = engine;
        this.uiHelper = uiHelper;
        this.normalizeSkinningWeights = true;
        this.cameraFocalLength = 28.0f;
        this.readyRenderables = new int[128];
        this.eyePos = new double[3];
        this.target = new double[3];
        this.upward = new double[3];
        final Renderer renderer = engine.createRenderer();
        czd.e((Object)renderer, "engine.createRenderer()");
        this.renderer = renderer;
        final Scene scene = engine.createScene();
        czd.e((Object)scene, "engine.createScene()");
        this.scene = scene;
        final Camera camera = engine.createCamera(engine.getEntityManager().create());
        czd.e((Object)camera, "engine.createCamera(engine.entityManager.create())");
        camera.setExposure(16.0f, 0.008f, 100.0f);
        this.camera = camera;
        final View view = engine.createView();
        czd.e((Object)view, "engine.createView()");
        (this.view = view).setScene(scene);
        view.setCamera(camera);
        this.assetLoader = new AssetLoader(engine, (MaterialProvider)new UbershaderLoader(engine), EntityManager.get());
        this.resourceLoader = new ResourceLoader(engine, this.normalizeSkinningWeights, this.recomputeBoundingBoxes, this.ignoreBindTransform);
        final int create = EntityManager.get().create();
        this.light = create;
        final float[] cct = Colors.cct(6500.0f);
        czd.e((Object)cct, "cct(6_500.0f)");
        new LightManager$Builder(LightManager$Type.DIRECTIONAL).color(cct[0], cct[1], cct[2]).intensity(100000.0f).direction(0.0f, -1.0f, 0.0f).castShadows(true).build(engine, create);
        scene.addEntity(create);
    }
    
    public static final Object access$fetchResources(final ModelViewer modelViewer, final FilamentAsset filamentAsset, final qsb qsb, final go6 go6) {
        return modelViewer.fetchResources(filamentAsset, (qsb<? super String, ? extends Buffer>)qsb, (go6<? super fzv>)go6);
    }
    
    public static final AssetLoader access$getAssetLoader$p(final ModelViewer modelViewer) {
        return modelViewer.assetLoader;
    }
    
    public static final Manipulator access$getCameraManipulator$p(final ModelViewer modelViewer) {
        return modelViewer.cameraManipulator;
    }
    
    public static final DisplayHelper access$getDisplayHelper$p(final ModelViewer modelViewer) {
        return modelViewer.displayHelper;
    }
    
    public static final int[] access$getReadyRenderables$p(final ModelViewer modelViewer) {
        return modelViewer.readyRenderables;
    }
    
    public static final ResourceLoader access$getResourceLoader$p(final ModelViewer modelViewer) {
        return modelViewer.resourceLoader;
    }
    
    public static final SurfaceView access$getSurfaceView$p(final ModelViewer modelViewer) {
        return modelViewer.surfaceView;
    }
    
    public static final SwapChain access$getSwapChain$p(final ModelViewer modelViewer) {
        return modelViewer.swapChain;
    }
    
    public static final TextureView access$getTextureView$p(final ModelViewer modelViewer) {
        return modelViewer.textureView;
    }
    
    public static final UiHelper access$getUiHelper$p(final ModelViewer modelViewer) {
        return modelViewer.uiHelper;
    }
    
    public static final void access$setAnimator$p(final ModelViewer modelViewer, final Animator animator) {
        modelViewer.animator = animator;
    }
    
    public static final void access$setSwapChain$p(final ModelViewer modelViewer, final SwapChain swapChain) {
        modelViewer.swapChain = swapChain;
    }
    
    public static final void access$updateCameraProjection(final ModelViewer modelViewer) {
        modelViewer.updateCameraProjection();
    }
    
    private final void addDetachListener(final android.view.View view) {
        view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ModelViewer$addDetachListener.ModelViewer$addDetachListener$1(this));
    }
    
    private final Object fetchResources(final FilamentAsset filamentAsset, final qsb<? super String, ? extends Buffer> qsb, final go6<? super fzv> go6) {
        final HashMap hashMap = new HashMap();
        final String[] resourceUris = filamentAsset.getResourceUris();
        czd.e((Object)resourceUris, "asset.resourceUris");
        final int length = resourceUris.length;
        int i = 0;
        while (i < length) {
            final String s = resourceUris[i];
            ++i;
            czd.e((Object)s, "resourceUri");
            hashMap.put(s, qsb.invoke((Object)s));
        }
        final ij8 a = b19.a;
        final Object x = as2.X((sx6)hhg.a, (ftb)new ModelViewer$fetchResources$2(hashMap, this, filamentAsset, (go6)null), (go6)go6);
        if (x == dy6.D0) {
            return x;
        }
        return fzv.a;
    }
    
    public static void getProgress$annotations() {
    }
    
    private final void populateScene(final FilamentAsset filamentAsset) {
        final RenderableManager renderableManager = this.engine.getRenderableManager();
        czd.e((Object)renderableManager, "engine.renderableManager");
        final p7m p7m = new p7m();
        while (((nsb)new ModelViewer$populateScene$popRenderables.ModelViewer$populateScene$popRenderables$1(p7m, filamentAsset, this)).invoke()) {
            int n = 0;
            final int n2 = p7m.D0 - 1;
            if (n2 >= 0) {
                while (true) {
                    renderableManager.setScreenSpaceContactShadows(renderableManager.getInstance(this.readyRenderables[n]), true);
                    if (n == n2) {
                        break;
                    }
                    ++n;
                }
            }
            this.scene.addEntities(mq4.L0((Collection)ct0.a1(this.readyRenderables, p7m.D0)));
        }
        this.scene.addEntities(filamentAsset.getLightEntities());
    }
    
    public static void transformToUnitCube$default(final ModelViewer modelViewer, Float3 kDefaultObjectPosition, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            kDefaultObjectPosition = ModelViewer.kDefaultObjectPosition;
        }
        modelViewer.transformToUnitCube(kDefaultObjectPosition);
    }
    
    private final void updateCameraProjection() {
        this.camera.setLensProjection(this.cameraFocalLength, this.view.getViewport().width / (double)this.view.getViewport().height, 0.05, 1000.0);
    }
    
    public final void clearRootTransform() {
        final FilamentAsset asset = this.asset;
        if (asset != null) {
            final TransformManager transformManager = this.getEngine().getTransformManager();
            czd.e((Object)transformManager, "engine.transformManager");
            transformManager.setTransform(transformManager.getInstance(asset.getRoot()), new Mat4(null, null, null, (Float4)null, 15, null).toFloatArray());
        }
    }
    
    public final void destroyModel() {
        final k9e fetchResourcesJob = this.fetchResourcesJob;
        if (fetchResourcesJob != null) {
            k9e$a.a(fetchResourcesJob, (CancellationException)null, 1, (Object)null);
        }
        this.resourceLoader.asyncCancelLoad();
        this.resourceLoader.evictResourceData();
        final FilamentAsset asset = this.asset;
        if (asset != null) {
            this.getScene().removeEntities(asset.getEntities());
            this.assetLoader.destroyAsset(asset);
            this.asset = null;
            this.animator = null;
        }
    }
    
    public final Animator getAnimator() {
        return this.animator;
    }
    
    public final FilamentAsset getAsset() {
        return this.asset;
    }
    
    public final Camera getCamera() {
        return this.camera;
    }
    
    public final float getCameraFocalLength() {
        return this.cameraFocalLength;
    }
    
    public final Engine getEngine() {
        return this.engine;
    }
    
    public final boolean getIgnoreBindTransform() {
        return this.ignoreBindTransform;
    }
    
    public final int getLight() {
        return this.light;
    }
    
    public final boolean getNormalizeSkinningWeights() {
        return this.normalizeSkinningWeights;
    }
    
    public final float getProgress() {
        return this.resourceLoader.asyncGetLoadProgress();
    }
    
    public final boolean getRecomputeBoundingBoxes() {
        return this.recomputeBoundingBoxes;
    }
    
    public final Renderer getRenderer() {
        return this.renderer;
    }
    
    public final Scene getScene() {
        return this.scene;
    }
    
    public final View getView() {
        return this.view;
    }
    
    public final void loadModelGlb(final Buffer buffer) {
        czd.f((Object)buffer, "buffer");
        this.destroyModel();
        final FilamentAsset assetFromBinary = this.assetLoader.createAssetFromBinary(buffer);
        this.asset = assetFromBinary;
        if (assetFromBinary != null) {
            this.resourceLoader.asyncBeginLoad(assetFromBinary);
            this.animator = assetFromBinary.getAnimator();
            assetFromBinary.releaseSourceData();
        }
    }
    
    public final void loadModelGltf(final Buffer buffer, final qsb<? super String, ? extends Buffer> qsb) {
        czd.f((Object)buffer, "buffer");
        czd.f((Object)qsb, "callback");
        this.destroyModel();
        final FilamentAsset assetFromJson = this.assetLoader.createAssetFromJson(buffer);
        this.asset = assetFromJson;
        if (assetFromJson != null) {
            final String[] resourceUris = assetFromJson.getResourceUris();
            czd.e((Object)resourceUris, "asset.resourceUris");
            int i = 0;
            while (i < resourceUris.length) {
                final String s = resourceUris[i];
                ++i;
                czd.e((Object)s, "uri");
                final Buffer buffer2 = (Buffer)qsb.invoke((Object)s);
                if (buffer2 == null) {
                    this.asset = null;
                    return;
                }
                this.resourceLoader.addResourceData(s, buffer2);
            }
            this.resourceLoader.asyncBeginLoad(assetFromJson);
            this.animator = assetFromJson.getAnimator();
            assetFromJson.releaseSourceData();
        }
    }
    
    public final void loadModelGltfAsync(final Buffer buffer, final qsb<? super String, ? extends Buffer> qsb) {
        czd.f((Object)buffer, "buffer");
        czd.f((Object)qsb, "callback");
        this.destroyModel();
        this.asset = this.assetLoader.createAssetFromJson(buffer);
        this.fetchResourcesJob = as2.M(sh4.b((sx6)b19.c), (sx6)null, 0, (ftb)new ModelViewer$loadModelGltfAsync$1(this, (qsb)qsb, (go6)null), 3);
    }
    
    public boolean onTouch(final android.view.View view, final MotionEvent motionEvent) {
        czd.f((Object)view, "view");
        czd.f((Object)motionEvent, "event");
        this.onTouchEvent(motionEvent);
        return true;
    }
    
    public final void onTouchEvent(final MotionEvent motionEvent) {
        czd.f((Object)motionEvent, "event");
        final GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
            return;
        }
        czd.m("gestureDetector");
        throw null;
    }
    
    public final void render(final long n) {
        if (!this.uiHelper.isReadyToRender()) {
            return;
        }
        this.resourceLoader.asyncUpdateLoad();
        final FilamentAsset asset = this.asset;
        if (asset != null) {
            this.populateScene(asset);
        }
        final Manipulator cameraManipulator = this.cameraManipulator;
        if (cameraManipulator != null) {
            cameraManipulator.getLookAt(this.eyePos, this.target, this.upward);
            final Camera camera = this.camera;
            final double[] eyePos = this.eyePos;
            final double n2 = eyePos[0];
            final double n3 = eyePos[1];
            final double n4 = eyePos[2];
            final double[] target = this.target;
            final double n5 = target[0];
            final double n6 = target[1];
            final double n7 = target[2];
            final double[] upward = this.upward;
            camera.lookAt(n2, n3, n4, n5, n6, n7, upward[0], upward[1], upward[2]);
            final Renderer renderer = this.renderer;
            final SwapChain swapChain = this.swapChain;
            czd.c((Object)swapChain);
            if (renderer.beginFrame(swapChain, n)) {
                this.renderer.render(this.view);
                this.renderer.endFrame();
            }
            return;
        }
        czd.m("cameraManipulator");
        throw null;
    }
    
    public final void setCameraFocalLength(final float cameraFocalLength) {
        this.cameraFocalLength = cameraFocalLength;
        this.updateCameraProjection();
    }
    
    public final void setIgnoreBindTransform(final boolean ignoreBindTransform) {
        this.ignoreBindTransform = ignoreBindTransform;
    }
    
    public final void setNormalizeSkinningWeights(final boolean normalizeSkinningWeights) {
        this.normalizeSkinningWeights = normalizeSkinningWeights;
    }
    
    public final void setRecomputeBoundingBoxes(final boolean recomputeBoundingBoxes) {
        this.recomputeBoundingBoxes = recomputeBoundingBoxes;
    }
    
    public final void transformToUnitCube(Float3 float3) {
        czd.f((Object)float3, "centerPoint");
        final FilamentAsset asset = this.asset;
        if (asset != null) {
            final TransformManager transformManager = this.getEngine().getTransformManager();
            czd.e((Object)transformManager, "engine.transformManager");
            final float[] center = asset.getBoundingBox().getCenter();
            final Float3 float4 = new Float3(center[0], center[1], center[2]);
            final float[] halfExtent = asset.getBoundingBox().getHalfExtent();
            final Float3 float5 = new Float3(halfExtent[0], halfExtent[1], halfExtent[2]);
            final float n = 2.0f / (Math.max(float5.getX(), Math.max(float5.getY(), float5.getZ())) * 2.0f);
            float3 = new Float3(float3.getX() / n, float3.getY() / n, float3.getZ() / n);
            float3 = new Float3(float4.getX() - float3.getX(), float4.getY() - float3.getY(), float4.getZ() - float3.getZ());
            transformManager.setTransform(transformManager.getInstance(asset.getRoot()), MatrixKt.transpose(MatrixKt.scale(new Float3(n)).times(MatrixKt.translation(float3.unaryMinus()))).toFloatArray());
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lcom/google/android/filament/utils/ModelViewer$Companion;", "", "()V", "kDefaultObjectPosition", "Lcom/google/android/filament/utils/Float3;", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final rf8 rf8) {
            this();
        }
    }
}
