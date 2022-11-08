// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.BufferOverflowException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.nio.Buffer;

public class RenderableManager
{
    private static final String LOG_TAG = "Filament";
    private static final VertexBuffer$VertexAttribute[] sVertexAttributeValues;
    private long mNativeObject;
    
    static {
        sVertexAttributeValues = VertexBuffer$VertexAttribute.values();
    }
    
    public RenderableManager(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native void nBuilderBlendOrder(final long p0, final int p1, final int p2);
    
    private static native void nBuilderBoundingBox(final long p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6);
    
    private static native boolean nBuilderBuild(final long p0, final long p1, final int p2);
    
    private static native void nBuilderCastShadows(final long p0, final boolean p1);
    
    private static native void nBuilderCulling(final long p0, final boolean p1);
    
    private static native void nBuilderGeometry(final long p0, final int p1, final int p2, final long p3, final long p4);
    
    private static native void nBuilderGeometry(final long p0, final int p1, final int p2, final long p3, final long p4, final int p5, final int p6);
    
    private static native void nBuilderGeometry(final long p0, final int p1, final int p2, final long p3, final long p4, final int p5, final int p6, final int p7, final int p8);
    
    private static native void nBuilderInstances(final long p0, final int p1);
    
    private static native void nBuilderLayerMask(final long p0, final int p1, final int p2);
    
    private static native void nBuilderLightChannel(final long p0, final int p1, final boolean p2);
    
    private static native void nBuilderMaterial(final long p0, final int p1, final long p2);
    
    private static native void nBuilderMorphing(final long p0, final int p1);
    
    private static native void nBuilderPriority(final long p0, final int p1);
    
    private static native void nBuilderReceiveShadows(final long p0, final boolean p1);
    
    private static native void nBuilderScreenSpaceContactShadows(final long p0, final boolean p1);
    
    private static native void nBuilderSetMorphTargetBufferAt(final long p0, final int p1, final int p2, final long p3, final int p4, final int p5);
    
    private static native void nBuilderSkinning(final long p0, final int p1);
    
    private static native int nBuilderSkinningBones(final long p0, final int p1, final Buffer p2, final int p3);
    
    private static native void nBuilderSkinningBuffer(final long p0, final long p1, final int p2, final int p3);
    
    private static native long nCreateBuilder(final int p0);
    
    private static native void nDestroy(final long p0, final int p1);
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native void nEnableSkinningBuffers(final long p0, final boolean p1);
    
    private static native void nGetAxisAlignedBoundingBox(final long p0, final int p1, final float[] p2, final float[] p3);
    
    private static native int nGetEnabledAttributesAt(final long p0, final int p1, final int p2);
    
    private static native int nGetInstance(final long p0, final int p1);
    
    private static native boolean nGetLightChannel(final long p0, final int p1, final int p2);
    
    private static native long nGetMaterialInstanceAt(final long p0, final int p1, final int p2);
    
    private static native int nGetMorphTargetCount(final long p0, final int p1);
    
    private static native int nGetPrimitiveCount(final long p0, final int p1);
    
    private static native boolean nHasComponent(final long p0, final int p1);
    
    private static native boolean nIsShadowCaster(final long p0, final int p1);
    
    private static native boolean nIsShadowReceiver(final long p0, final int p1);
    
    private static native void nSetAxisAlignedBoundingBox(final long p0, final int p1, final float p2, final float p3, final float p4, final float p5, final float p6, final float p7);
    
    private static native void nSetBlendOrderAt(final long p0, final int p1, final int p2, final int p3);
    
    private static native int nSetBonesAsMatrices(final long p0, final int p1, final Buffer p2, final int p3, final int p4, final int p5);
    
    private static native int nSetBonesAsQuaternions(final long p0, final int p1, final Buffer p2, final int p3, final int p4, final int p5);
    
    private static native void nSetCastShadows(final long p0, final int p1, final boolean p2);
    
    private static native void nSetCulling(final long p0, final int p1, final boolean p2);
    
    private static native void nSetGeometryAt(final long p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    private static native void nSetGeometryAt(final long p0, final int p1, final int p2, final int p3, final long p4, final long p5, final int p6, final int p7);
    
    private static native void nSetLayerMask(final long p0, final int p1, final int p2, final int p3);
    
    private static native void nSetLightChannel(final long p0, final int p1, final int p2, final boolean p3);
    
    private static native void nSetMaterialInstanceAt(final long p0, final int p1, final int p2, final long p3);
    
    private static native void nSetMorphTargetBufferAt(final long p0, final int p1, final int p2, final int p3, final long p4, final int p5, final int p6);
    
    private static native void nSetMorphWeights(final long p0, final int p1, final float[] p2, final int p3);
    
    private static native void nSetPriority(final long p0, final int p1, final int p2);
    
    private static native void nSetReceiveShadows(final long p0, final int p1, final boolean p2);
    
    private static native void nSetScreenSpaceContactShadows(final long p0, final int p1, final boolean p2);
    
    private static native void nSetSkinningBuffer(final long p0, final int p1, final long p2, final int p3, final int p4);
    
    public void destroy(@Entity final int n) {
        nDestroy(this.mNativeObject, n);
    }
    
    public Box getAxisAlignedBoundingBox(@EntityInstance final int n, final Box box) {
        Box box2 = box;
        if (box == null) {
            box2 = new Box();
        }
        nGetAxisAlignedBoundingBox(this.mNativeObject, n, box2.getCenter(), box2.getHalfExtent());
        return box2;
    }
    
    public Set<VertexBuffer$VertexAttribute> getEnabledAttributesAt(@EntityInstance int i, int nGetEnabledAttributes) {
        nGetEnabledAttributes = nGetEnabledAttributesAt(this.mNativeObject, i, nGetEnabledAttributes);
        final EnumSet<VertexBuffer$VertexAttribute> none = EnumSet.noneOf(VertexBuffer$VertexAttribute.class);
        VertexBuffer$VertexAttribute[] sVertexAttributeValues;
        for (sVertexAttributeValues = RenderableManager.sVertexAttributeValues, i = 0; i < sVertexAttributeValues.length; ++i) {
            if ((1 << i & nGetEnabledAttributes) != 0x0) {
                none.add(sVertexAttributeValues[i]);
            }
        }
        return (Set<VertexBuffer$VertexAttribute>)Collections.unmodifiableSet((Set<?>)none);
    }
    
    @EntityInstance
    public int getInstance(@Entity final int n) {
        return nGetInstance(this.mNativeObject, n);
    }
    
    public boolean getLightChannel(@EntityInstance final int n, final int n2) {
        return nGetLightChannel(this.mNativeObject, n, n2);
    }
    
    public MaterialInstance getMaterialInstanceAt(@EntityInstance final int n, final int n2) {
        return new MaterialInstance(nGetMaterialInstanceAt(this.mNativeObject, n, n2));
    }
    
    public int getMorphTargetCount(@EntityInstance final int n) {
        return nGetMorphTargetCount(this.mNativeObject, n);
    }
    
    public long getNativeObject() {
        return this.mNativeObject;
    }
    
    public int getPrimitiveCount(@EntityInstance final int n) {
        return nGetPrimitiveCount(this.mNativeObject, n);
    }
    
    public boolean hasComponent(@Entity final int n) {
        return nHasComponent(this.mNativeObject, n);
    }
    
    public boolean isShadowCaster(@EntityInstance final int n) {
        return nIsShadowCaster(this.mNativeObject, n);
    }
    
    public boolean isShadowReceiver(@EntityInstance final int n) {
        return nIsShadowReceiver(this.mNativeObject, n);
    }
    
    public void setAxisAlignedBoundingBox(@EntityInstance final int n, final Box box) {
        nSetAxisAlignedBoundingBox(this.mNativeObject, n, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
    }
    
    public void setBlendOrderAt(@EntityInstance final int n, final int n2, final int n3) {
        nSetBlendOrderAt(this.mNativeObject, n, n2, n3);
    }
    
    public void setBonesAsMatrices(@EntityInstance final int n, final Buffer buffer, final int n2, final int n3) {
        if (nSetBonesAsMatrices(this.mNativeObject, n, buffer, buffer.remaining(), n2, n3) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }
    
    public void setBonesAsQuaternions(@EntityInstance final int n, final Buffer buffer, final int n2, final int n3) {
        if (nSetBonesAsQuaternions(this.mNativeObject, n, buffer, buffer.remaining(), n2, n3) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }
    
    public void setCastShadows(@EntityInstance final int n, final boolean b) {
        nSetCastShadows(this.mNativeObject, n, b);
    }
    
    public void setCulling(@EntityInstance final int n, final boolean b) {
        nSetCulling(this.mNativeObject, n, b);
    }
    
    public void setGeometryAt(@EntityInstance final int n, final int n2, final PrimitiveType primitiveType, final int n3, final int n4) {
        nSetGeometryAt(this.mNativeObject, n, n2, primitiveType.getValue(), n3, n4);
    }
    
    public void setGeometryAt(@EntityInstance final int n, final int n2, final PrimitiveType primitiveType, final VertexBuffer vertexBuffer, final IndexBuffer indexBuffer) {
        nSetGeometryAt(this.mNativeObject, n, n2, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), 0, indexBuffer.getIndexCount());
    }
    
    public void setGeometryAt(@EntityInstance final int n, final int n2, final PrimitiveType primitiveType, final VertexBuffer vertexBuffer, final IndexBuffer indexBuffer, final int n3, final int n4) {
        nSetGeometryAt(this.mNativeObject, n, n2, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), n3, n4);
    }
    
    public void setLayerMask(@EntityInstance final int n, final int n2, final int n3) {
        nSetLayerMask(this.mNativeObject, n, n2, n3);
    }
    
    public void setLightChannel(@EntityInstance final int n, final int n2, final boolean b) {
        nSetLightChannel(this.mNativeObject, n, n2, b);
    }
    
    public void setMaterialInstanceAt(@EntityInstance final int n, final int n2, final MaterialInstance materialInstance) {
        final int requiredAttributesAsInt = materialInstance.getMaterial().getRequiredAttributesAsInt();
        if ((nGetEnabledAttributesAt(this.mNativeObject, n, n2) & requiredAttributesAsInt) != requiredAttributesAsInt) {
            final Platform value = Platform.get();
            final StringBuilder j = sbl.j("setMaterialInstanceAt() on primitive ", n2, " of Renderable at ", n, ": declared attributes ");
            j.append(this.getEnabledAttributesAt(n, n2));
            j.append(" do no satisfy required attributes ");
            j.append(materialInstance.getMaterial().getRequiredAttributes());
            value.warn(j.toString());
        }
        nSetMaterialInstanceAt(this.mNativeObject, n, n2, materialInstance.getNativeObject());
    }
    
    public void setMorphTargetBufferAt(@EntityInstance final int n, final int n2, final int n3, final MorphTargetBuffer morphTargetBuffer) {
        nSetMorphTargetBufferAt(this.mNativeObject, n, n2, n3, morphTargetBuffer.getNativeObject(), 0, morphTargetBuffer.getVertexCount());
    }
    
    public void setMorphTargetBufferAt(@EntityInstance final int n, final int n2, final int n3, final MorphTargetBuffer morphTargetBuffer, final int n4, final int n5) {
        nSetMorphTargetBufferAt(this.mNativeObject, n, n2, n3, morphTargetBuffer.getNativeObject(), n4, n5);
    }
    
    public void setMorphWeights(@EntityInstance final int n, final float[] array, final int n2) {
        nSetMorphWeights(this.mNativeObject, n, array, n2);
    }
    
    public void setPriority(@EntityInstance final int n, final int n2) {
        nSetPriority(this.mNativeObject, n, n2);
    }
    
    public void setReceiveShadows(@EntityInstance final int n, final boolean b) {
        nSetReceiveShadows(this.mNativeObject, n, b);
    }
    
    public void setScreenSpaceContactShadows(@EntityInstance final int n, final boolean b) {
        nSetScreenSpaceContactShadows(this.mNativeObject, n, b);
    }
    
    public void setSkinningBuffer(@EntityInstance final int n, final SkinningBuffer skinningBuffer, final int n2, final int n3) {
        nSetSkinningBuffer(this.mNativeObject, n, skinningBuffer.getNativeObject(), n2, n3);
    }
    
    public static class Builder
    {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        
        public Builder(final int n) {
            final long access$000 = nCreateBuilder(n);
            this.mNativeBuilder = access$000;
            this.mFinalizer = new BuilderFinalizer(access$000);
        }
        
        public Builder blendOrder(final int n, final int n2) {
            nBuilderBlendOrder(this.mNativeBuilder, n, n2);
            return this;
        }
        
        public Builder boundingBox(final Box box) {
            nBuilderBoundingBox(this.mNativeBuilder, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
            return this;
        }
        
        public void build(final Engine engine, @Entity final int n) {
            if (nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), n)) {
                return;
            }
            throw new IllegalStateException(ffa.k("Couldn't create Renderable component for entity ", n, ", see log."));
        }
        
        public Builder castShadows(final boolean b) {
            nBuilderCastShadows(this.mNativeBuilder, b);
            return this;
        }
        
        public Builder culling(final boolean b) {
            nBuilderCulling(this.mNativeBuilder, b);
            return this;
        }
        
        public Builder enableSkinningBuffers(final boolean b) {
            nEnableSkinningBuffers(this.mNativeBuilder, b);
            return this;
        }
        
        public Builder geometry(final int n, final PrimitiveType primitiveType, final VertexBuffer vertexBuffer, final IndexBuffer indexBuffer) {
            nBuilderGeometry(this.mNativeBuilder, n, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject());
            return this;
        }
        
        public Builder geometry(final int n, final PrimitiveType primitiveType, final VertexBuffer vertexBuffer, final IndexBuffer indexBuffer, final int n2, final int n3) {
            nBuilderGeometry(this.mNativeBuilder, n, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), n2, n3);
            return this;
        }
        
        public Builder geometry(final int n, final PrimitiveType primitiveType, final VertexBuffer vertexBuffer, final IndexBuffer indexBuffer, final int n2, final int n3, final int n4, final int n5) {
            nBuilderGeometry(this.mNativeBuilder, n, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), n2, n3, n4, n5);
            return this;
        }
        
        public Builder instances(final int n) {
            nBuilderInstances(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder layerMask(final int n, final int n2) {
            nBuilderLayerMask(this.mNativeBuilder, n & 0xFF, n2 & 0xFF);
            return this;
        }
        
        public Builder lightChannel(final int n, final boolean b) {
            nBuilderLightChannel(this.mNativeBuilder, n, b);
            return this;
        }
        
        public Builder material(final int n, final MaterialInstance materialInstance) {
            nBuilderMaterial(this.mNativeBuilder, n, materialInstance.getNativeObject());
            return this;
        }
        
        public Builder morphing(final int n) {
            nBuilderMorphing(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder morphing(final int n, final int n2, final MorphTargetBuffer morphTargetBuffer) {
            nBuilderSetMorphTargetBufferAt(this.mNativeBuilder, n, n2, morphTargetBuffer.getNativeObject(), 0, morphTargetBuffer.getVertexCount());
            return this;
        }
        
        public Builder morphing(final int n, final int n2, final MorphTargetBuffer morphTargetBuffer, final int n3, final int n4) {
            nBuilderSetMorphTargetBufferAt(this.mNativeBuilder, n, n2, morphTargetBuffer.getNativeObject(), n3, n4);
            return this;
        }
        
        public Builder priority(final int n) {
            nBuilderPriority(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder receiveShadows(final boolean b) {
            nBuilderReceiveShadows(this.mNativeBuilder, b);
            return this;
        }
        
        public Builder screenSpaceContactShadows(final boolean b) {
            nBuilderScreenSpaceContactShadows(this.mNativeBuilder, b);
            return this;
        }
        
        public Builder skinning(final int n) {
            nBuilderSkinning(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder skinning(final int n, final Buffer buffer) {
            if (nBuilderSkinningBones(this.mNativeBuilder, n, buffer, buffer.remaining()) >= 0) {
                return this;
            }
            throw new BufferOverflowException();
        }
        
        public Builder skinning(final SkinningBuffer skinningBuffer, final int n, final int n2) {
            final long mNativeBuilder = this.mNativeBuilder;
            long nativeObject;
            if (skinningBuffer != null) {
                nativeObject = skinningBuffer.getNativeObject();
            }
            else {
                nativeObject = 0L;
            }
            nBuilderSkinningBuffer(mNativeBuilder, nativeObject, n, n2);
            return this;
        }
        
        public static class BuilderFinalizer
        {
            private final long mNativeObject;
            
            public BuilderFinalizer(final long mNativeObject) {
                this.mNativeObject = mNativeObject;
            }
            
            public void finalize() {
                while (true) {
                    try {
                        super.finalize();
                        nDestroyBuilder(this.mNativeObject);
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public enum PrimitiveType
    {
        LINES(1), 
        LINE_STRIP(3), 
        POINTS(0), 
        TRIANGLES(4), 
        TRIANGLE_STRIP(5);
        
        private final int mType;
        
        private PrimitiveType(final int mType) {
            this.mType = mType;
        }
        
        public int getValue() {
            return this.mType;
        }
    }
}
