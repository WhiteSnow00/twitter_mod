// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import com.google.android.filament.proguard.UsedByReflection;

public class Engine
{
    private static final Backend[] sBackendValues;
    private final EntityManager mEntityManager;
    private final LightManager mLightManager;
    private long mNativeObject;
    private final RenderableManager mRenderableManager;
    private final TransformManager mTransformManager;
    
    static {
        sBackendValues = Backend.values();
    }
    
    private Engine(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
        this.mTransformManager = new TransformManager(nGetTransformManager(mNativeObject));
        this.mLightManager = new LightManager(nGetLightManager(mNativeObject));
        this.mRenderableManager = new RenderableManager(nGetRenderableManager(mNativeObject));
        this.mEntityManager = new EntityManager(nGetEntityManager(mNativeObject));
    }
    
    private static void assertDestroy(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException("Object couldn't be destroyed (double destroy()?)");
    }
    
    private void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public static Engine create() {
        final long nCreateEngine = nCreateEngine(0L, 0L);
        if (nCreateEngine != 0L) {
            return new Engine(nCreateEngine);
        }
        throw new IllegalStateException("Couldn't create Engine");
    }
    
    public static Engine create(final Backend backend) {
        final long nCreateEngine = nCreateEngine(backend.ordinal(), 0L);
        if (nCreateEngine != 0L) {
            return new Engine(nCreateEngine);
        }
        throw new IllegalStateException("Couldn't create Engine");
    }
    
    public static Engine create(final Object o) {
        if (!Platform.get().validateSharedContext(o)) {
            throw new IllegalArgumentException(t4a.j("Invalid shared context ", o));
        }
        final long nCreateEngine = nCreateEngine(0L, Platform.get().getSharedContextNativeHandle(o));
        if (nCreateEngine != 0L) {
            return new Engine(nCreateEngine);
        }
        throw new IllegalStateException("Couldn't create Engine");
    }
    
    private static native long nCreateCamera(final long p0, final int p1);
    
    private static native long nCreateEngine(final long p0, final long p1);
    
    private static native long nCreateFence(final long p0);
    
    private static native long nCreateRenderer(final long p0);
    
    private static native long nCreateScene(final long p0);
    
    private static native long nCreateSwapChain(final long p0, final Object p1, final long p2);
    
    private static native long nCreateSwapChainFromRawPointer(final long p0, final long p1, final long p2);
    
    private static native long nCreateSwapChainHeadless(final long p0, final int p1, final int p2, final long p3);
    
    private static native long nCreateView(final long p0);
    
    private static native void nDestroyCameraComponent(final long p0, final int p1);
    
    private static native boolean nDestroyColorGrading(final long p0, final long p1);
    
    private static native void nDestroyEngine(final long p0);
    
    private static native void nDestroyEntity(final long p0, final int p1);
    
    private static native boolean nDestroyFence(final long p0, final long p1);
    
    private static native boolean nDestroyIndexBuffer(final long p0, final long p1);
    
    private static native boolean nDestroyIndirectLight(final long p0, final long p1);
    
    private static native boolean nDestroyMaterial(final long p0, final long p1);
    
    private static native boolean nDestroyMaterialInstance(final long p0, final long p1);
    
    private static native boolean nDestroyRenderTarget(final long p0, final long p1);
    
    private static native boolean nDestroyRenderer(final long p0, final long p1);
    
    private static native boolean nDestroyScene(final long p0, final long p1);
    
    private static native boolean nDestroySkinningBuffer(final long p0, final long p1);
    
    private static native boolean nDestroySkybox(final long p0, final long p1);
    
    private static native boolean nDestroyStream(final long p0, final long p1);
    
    private static native boolean nDestroySwapChain(final long p0, final long p1);
    
    private static native boolean nDestroyTexture(final long p0, final long p1);
    
    private static native boolean nDestroyVertexBuffer(final long p0, final long p1);
    
    private static native boolean nDestroyView(final long p0, final long p1);
    
    private static native void nFlushAndWait(final long p0);
    
    private static native long nGetBackend(final long p0);
    
    private static native long nGetCameraComponent(final long p0, final int p1);
    
    private static native long nGetEntityManager(final long p0);
    
    private static native long nGetJobSystem(final long p0);
    
    private static native long nGetLightManager(final long p0);
    
    private static native long nGetRenderableManager(final long p0);
    
    private static native long nGetTransformManager(final long p0);
    
    public Camera createCamera(@Entity final int n) {
        final long nCreateCamera = nCreateCamera(this.getNativeObject(), n);
        if (nCreateCamera != 0L) {
            return new Camera(nCreateCamera, n);
        }
        throw new IllegalStateException("Couldn't create Camera");
    }
    
    public Fence createFence() {
        final long nCreateFence = nCreateFence(this.getNativeObject());
        if (nCreateFence != 0L) {
            return new Fence(nCreateFence);
        }
        throw new IllegalStateException("Couldn't create Fence");
    }
    
    public Renderer createRenderer() {
        final long nCreateRenderer = nCreateRenderer(this.getNativeObject());
        if (nCreateRenderer != 0L) {
            return new Renderer(this, nCreateRenderer);
        }
        throw new IllegalStateException("Couldn't create Renderer");
    }
    
    public Scene createScene() {
        final long nCreateScene = nCreateScene(this.getNativeObject());
        if (nCreateScene != 0L) {
            return new Scene(nCreateScene);
        }
        throw new IllegalStateException("Couldn't create Scene");
    }
    
    public SwapChain createSwapChain(final int n, final int n2, long nCreateSwapChainHeadless) {
        if (n < 0 || n2 < 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        nCreateSwapChainHeadless = nCreateSwapChainHeadless(this.getNativeObject(), n, n2, nCreateSwapChainHeadless);
        if (nCreateSwapChainHeadless != 0L) {
            return new SwapChain(nCreateSwapChainHeadless, null);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }
    
    public SwapChain createSwapChain(final Object o) {
        return this.createSwapChain(o, 0L);
    }
    
    public SwapChain createSwapChain(final Object o, long nCreateSwapChain) {
        if (!Platform.get().validateSurface(o)) {
            throw new IllegalArgumentException(t4a.j("Invalid surface ", o));
        }
        nCreateSwapChain = nCreateSwapChain(this.getNativeObject(), o, nCreateSwapChain);
        if (nCreateSwapChain != 0L) {
            return new SwapChain(nCreateSwapChain, o);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }
    
    public SwapChain createSwapChainFromNativeSurface(final NativeSurface nativeSurface, long nCreateSwapChainFromRawPointer) {
        nCreateSwapChainFromRawPointer = nCreateSwapChainFromRawPointer(this.getNativeObject(), nativeSurface.getNativeObject(), nCreateSwapChainFromRawPointer);
        if (nCreateSwapChainFromRawPointer != 0L) {
            return new SwapChain(nCreateSwapChainFromRawPointer, nativeSurface);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }
    
    public View createView() {
        final long nCreateView = nCreateView(this.getNativeObject());
        if (nCreateView != 0L) {
            return new View(nCreateView);
        }
        throw new IllegalStateException("Couldn't create View");
    }
    
    public void destroy() {
        nDestroyEngine(this.getNativeObject());
        this.clearNativeObject();
    }
    
    public void destroyCameraComponent(@Entity final int n) {
        nDestroyCameraComponent(this.getNativeObject(), n);
    }
    
    public void destroyColorGrading(final ColorGrading colorGrading) {
        assertDestroy(nDestroyColorGrading(this.getNativeObject(), colorGrading.getNativeObject()));
        colorGrading.clearNativeObject();
    }
    
    public void destroyEntity(@Entity final int n) {
        nDestroyEntity(this.getNativeObject(), n);
    }
    
    public void destroyFence(final Fence fence) {
        assertDestroy(nDestroyFence(this.getNativeObject(), fence.getNativeObject()));
        fence.clearNativeObject();
    }
    
    public void destroyIndexBuffer(final IndexBuffer indexBuffer) {
        assertDestroy(nDestroyIndexBuffer(this.getNativeObject(), indexBuffer.getNativeObject()));
        indexBuffer.clearNativeObject();
    }
    
    public void destroyIndirectLight(final IndirectLight indirectLight) {
        assertDestroy(nDestroyIndirectLight(this.getNativeObject(), indirectLight.getNativeObject()));
        indirectLight.clearNativeObject();
    }
    
    public void destroyMaterial(final Material material) {
        assertDestroy(nDestroyMaterial(this.getNativeObject(), material.getNativeObject()));
        material.clearNativeObject();
    }
    
    public void destroyMaterialInstance(final MaterialInstance materialInstance) {
        assertDestroy(nDestroyMaterialInstance(this.getNativeObject(), materialInstance.getNativeObject()));
        materialInstance.clearNativeObject();
    }
    
    public void destroyRenderTarget(final RenderTarget renderTarget) {
        nDestroyRenderTarget(this.getNativeObject(), renderTarget.getNativeObject());
        renderTarget.clearNativeObject();
    }
    
    public void destroyRenderer(final Renderer renderer) {
        assertDestroy(nDestroyRenderer(this.getNativeObject(), renderer.getNativeObject()));
        renderer.clearNativeObject();
    }
    
    public void destroyScene(final Scene scene) {
        assertDestroy(nDestroyScene(this.getNativeObject(), scene.getNativeObject()));
        scene.clearNativeObject();
    }
    
    public void destroySkinningBuffer(final SkinningBuffer skinningBuffer) {
        assertDestroy(nDestroySkinningBuffer(this.getNativeObject(), skinningBuffer.getNativeObject()));
        skinningBuffer.clearNativeObject();
    }
    
    public void destroySkybox(final Skybox skybox) {
        assertDestroy(nDestroySkybox(this.getNativeObject(), skybox.getNativeObject()));
        skybox.clearNativeObject();
    }
    
    public void destroyStream(final Stream stream) {
        assertDestroy(nDestroyStream(this.getNativeObject(), stream.getNativeObject()));
        stream.clearNativeObject();
    }
    
    public void destroySwapChain(final SwapChain swapChain) {
        assertDestroy(nDestroySwapChain(this.getNativeObject(), swapChain.getNativeObject()));
        swapChain.clearNativeObject();
    }
    
    public void destroyTexture(final Texture texture) {
        assertDestroy(nDestroyTexture(this.getNativeObject(), texture.getNativeObject()));
        texture.clearNativeObject();
    }
    
    public void destroyVertexBuffer(final VertexBuffer vertexBuffer) {
        assertDestroy(nDestroyVertexBuffer(this.getNativeObject(), vertexBuffer.getNativeObject()));
        vertexBuffer.clearNativeObject();
    }
    
    public void destroyView(final View view) {
        assertDestroy(nDestroyView(this.getNativeObject(), view.getNativeObject()));
        view.clearNativeObject();
    }
    
    public void flushAndWait() {
        nFlushAndWait(this.getNativeObject());
    }
    
    public Backend getBackend() {
        return Engine.sBackendValues[(int)nGetBackend(this.getNativeObject())];
    }
    
    public Camera getCameraComponent(@Entity final int n) {
        final long nGetCameraComponent = nGetCameraComponent(this.getNativeObject(), n);
        if (nGetCameraComponent == 0L) {
            return null;
        }
        return new Camera(nGetCameraComponent, n);
    }
    
    public EntityManager getEntityManager() {
        return this.mEntityManager;
    }
    
    public LightManager getLightManager() {
        return this.mLightManager;
    }
    
    @UsedByReflection("MaterialBuilder.java")
    public long getNativeJobSystem() {
        if (this.mNativeObject != 0L) {
            return nGetJobSystem(this.getNativeObject());
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }
    
    @UsedByReflection("TextureHelper.java")
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }
    
    public RenderableManager getRenderableManager() {
        return this.mRenderableManager;
    }
    
    public TransformManager getTransformManager() {
        return this.mTransformManager;
    }
    
    public boolean isValid() {
        return this.mNativeObject != 0L;
    }
    
    public enum Backend
    {
        DEFAULT, 
        METAL, 
        NOOP, 
        OPENGL, 
        VULKAN;
    }
}
