// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.navigation.profile;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B]\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u001b\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b9\u0010:Bg\b\u0017\u0012\u0006\u0010;\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b9\u0010>J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0010H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u00c6\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u001a\u001a\u00020\u00102\b\b\u0003\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u001f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010 \u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003R \u0010\u0016\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0018\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b/\u0010+R\u001a\u0010\u001a\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u001b\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b3\u00102R\u001a\u0010\u001c\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106R\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010$\u0012\u0004\b8\u0010(\u001a\u0004\b7\u0010&¨\u0006A" }, d2 = { "Lcom/twitter/navigation/profile/ImageActivityArgs;", "Lcom/twitter/navigation/profile/BaseImageActivityArgs;", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "Landroid/net/Uri;", "component1", "", "component2", "", "component3", "component4", "", "component5", "component6", "", "component7", "component8", "mediaUri", "imageUrl", "useCircularImage", "description", "actionLabelResId", "backgroundColor", "ownerId", "externalUri", "copy", "toString", "hashCode", "", "other", "equals", "Landroid/net/Uri;", "getMediaUri", "()Landroid/net/Uri;", "getMediaUri$annotations", "()V", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "Z", "getUseCircularImage", "()Z", "getDescription", "I", "getActionLabelResId", "()I", "getBackgroundColor", "J", "getOwnerId", "()J", "getExternalUri", "getExternalUri$annotations", "<init>", "(Landroid/net/Uri;Ljava/lang/String;ZLjava/lang/String;IIJLandroid/net/Uri;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILandroid/net/Uri;Ljava/lang/String;ZLjava/lang/String;IIJLandroid/net/Uri;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.navigation.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class ImageActivityArgs extends BaseImageActivityArgs
{
    public static final ImageActivityArgs.ImageActivityArgs$Companion Companion;
    private final int actionLabelResId;
    private final int backgroundColor;
    private final String description;
    private final Uri externalUri;
    private final String imageUrl;
    private final Uri mediaUri = mediaUri;
    private final long ownerId;
    private final boolean useCircularImage;
    
    static {
        Companion = new ImageActivityArgs.ImageActivityArgs$Companion();
    }
    
    public ImageActivityArgs(final Uri uri) {
        zzd.f((Object)uri, "mediaUri");
        this(uri, null, false, null, 0, 0, 0L, null, 254, null);
    }
    
    public ImageActivityArgs(final Uri uri, final String s) {
        zzd.f((Object)uri, "mediaUri");
        this(uri, s, false, null, 0, 0, 0L, null, 252, null);
    }
    
    public ImageActivityArgs(final Uri uri, final String s, final boolean b) {
        zzd.f((Object)uri, "mediaUri");
        this(uri, s, b, null, 0, 0, 0L, null, 248, null);
    }
    
    public ImageActivityArgs(final Uri uri, final String s, final boolean b, final String s2) {
        zzd.f((Object)uri, "mediaUri");
        this(uri, s, b, s2, 0, 0, 0L, null, 240, null);
    }
    
    public ImageActivityArgs(final Uri uri, final String s, final boolean b, final String s2, final int n) {
        zzd.f((Object)uri, "mediaUri");
        this(uri, s, b, s2, n, 0, 0L, null, 224, null);
    }
    
    public ImageActivityArgs(final Uri uri, final String s, final boolean b, final String s2, final int n, final int n2) {
        zzd.f((Object)uri, "mediaUri");
        this(uri, s, b, s2, n, n2, 0L, null, 192, null);
    }
    
    public ImageActivityArgs(final Uri uri, final String s, final boolean b, final String s2, final int n, final int n2, final long n3) {
        zzd.f((Object)uri, "mediaUri");
        this(uri, s, b, s2, n, n2, n3, null, 128, null);
    }
    
    public ImageActivityArgs(final Uri mediaUri, final String imageUrl, final boolean useCircularImage, final String description, final int actionLabelResId, final int backgroundColor, final long ownerId, final Uri externalUri) {
        zzd.f((Object)mediaUri, "mediaUri");
        super((hg8)null);
        this.mediaUri = mediaUri;
        this.imageUrl = imageUrl;
        this.useCircularImage = useCircularImage;
        this.description = description;
        this.actionLabelResId = actionLabelResId;
        this.backgroundColor = backgroundColor;
        this.ownerId = ownerId;
        this.externalUri = externalUri;
    }
    
    public static final void write$Self(final ImageActivityArgs imageActivityArgs, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)imageActivityArgs, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        BaseImageActivityArgs.write$Self((BaseImageActivityArgs)imageActivityArgs, sd6, serialDescriptor);
        final l5w b = l5w.b;
        final Uri mediaUri = imageActivityArgs.getMediaUri();
        final int n = 0;
        sd6.T(serialDescriptor, 0, (skp)b, (Object)mediaUri);
        boolean b2 = false;
        Label_0077: {
            if (!sd6.z(serialDescriptor)) {
                if (imageActivityArgs.getImageUrl() == null) {
                    b2 = false;
                    break Label_0077;
                }
            }
            b2 = true;
        }
        if (b2) {
            sd6.x(serialDescriptor, 1, (skp)njr.a, (Object)imageActivityArgs.getImageUrl());
        }
        boolean b3 = false;
        Label_0126: {
            if (!sd6.z(serialDescriptor)) {
                if (!imageActivityArgs.getUseCircularImage()) {
                    b3 = false;
                    break Label_0126;
                }
            }
            b3 = true;
        }
        if (b3) {
            sd6.R(serialDescriptor, 2, imageActivityArgs.getUseCircularImage());
        }
        boolean b4 = false;
        Label_0172: {
            if (!sd6.z(serialDescriptor)) {
                if (imageActivityArgs.getDescription() == null) {
                    b4 = false;
                    break Label_0172;
                }
            }
            b4 = true;
        }
        if (b4) {
            sd6.x(serialDescriptor, 3, (skp)njr.a, (Object)imageActivityArgs.getDescription());
        }
        boolean b5 = false;
        Label_0222: {
            if (!sd6.z(serialDescriptor)) {
                if (imageActivityArgs.getActionLabelResId() == -1) {
                    b5 = false;
                    break Label_0222;
                }
            }
            b5 = true;
        }
        if (b5) {
            sd6.Q(serialDescriptor, 4, imageActivityArgs.getActionLabelResId());
        }
        boolean b6 = false;
        Label_0268: {
            if (!sd6.z(serialDescriptor)) {
                if (imageActivityArgs.getBackgroundColor() == 0) {
                    b6 = false;
                    break Label_0268;
                }
            }
            b6 = true;
        }
        if (b6) {
            sd6.Q(serialDescriptor, 5, imageActivityArgs.getBackgroundColor());
        }
        boolean b7 = false;
        Label_0316: {
            if (!sd6.z(serialDescriptor)) {
                if (imageActivityArgs.getOwnerId() == 0L) {
                    b7 = false;
                    break Label_0316;
                }
            }
            b7 = true;
        }
        if (b7) {
            sd6.i0(serialDescriptor, 6, imageActivityArgs.getOwnerId());
        }
        int n2 = 0;
        Label_0361: {
            if (!sd6.z(serialDescriptor)) {
                n2 = n;
                if (imageActivityArgs.getExternalUri() == null) {
                    break Label_0361;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            sd6.x(serialDescriptor, 7, (skp)b, (Object)imageActivityArgs.getExternalUri());
        }
    }
    
    public final Uri component1() {
        return this.getMediaUri();
    }
    
    public final String component2() {
        return this.getImageUrl();
    }
    
    public final boolean component3() {
        return this.getUseCircularImage();
    }
    
    public final String component4() {
        return this.getDescription();
    }
    
    public final int component5() {
        return this.getActionLabelResId();
    }
    
    public final int component6() {
        return this.getBackgroundColor();
    }
    
    public final long component7() {
        return this.getOwnerId();
    }
    
    public final Uri component8() {
        return this.getExternalUri();
    }
    
    public final ImageActivityArgs copy(final Uri uri, final String s, final boolean b, final String s2, final int n, final int n2, final long n3, final Uri uri2) {
        zzd.f((Object)uri, "mediaUri");
        return new ImageActivityArgs(uri, s, b, s2, n, n2, n3, uri2);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageActivityArgs)) {
            return false;
        }
        final ImageActivityArgs imageActivityArgs = (ImageActivityArgs)o;
        return zzd.a((Object)this.getMediaUri(), (Object)imageActivityArgs.getMediaUri()) && zzd.a((Object)this.getImageUrl(), (Object)imageActivityArgs.getImageUrl()) && this.getUseCircularImage() == imageActivityArgs.getUseCircularImage() && zzd.a((Object)this.getDescription(), (Object)imageActivityArgs.getDescription()) && this.getActionLabelResId() == imageActivityArgs.getActionLabelResId() && this.getBackgroundColor() == imageActivityArgs.getBackgroundColor() && this.getOwnerId() == imageActivityArgs.getOwnerId() && zzd.a((Object)this.getExternalUri(), (Object)imageActivityArgs.getExternalUri());
    }
    
    public int getActionLabelResId() {
        return this.actionLabelResId;
    }
    
    public int getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public Uri getExternalUri() {
        return this.externalUri;
    }
    
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public Uri getMediaUri() {
        return this.mediaUri;
    }
    
    public long getOwnerId() {
        return this.ownerId;
    }
    
    public boolean getUseCircularImage() {
        return this.useCircularImage;
    }
    
    public int hashCode() {
        final int hashCode = this.getMediaUri().hashCode();
        final String imageUrl = this.getImageUrl();
        int hashCode2 = 0;
        int hashCode3;
        if (imageUrl == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = this.getImageUrl().hashCode();
        }
        int useCircularImage;
        if ((useCircularImage = (this.getUseCircularImage() ? 1 : 0)) != 0) {
            useCircularImage = 1;
        }
        int hashCode4;
        if (this.getDescription() == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = this.getDescription().hashCode();
        }
        final int actionLabelResId = this.getActionLabelResId();
        final int backgroundColor = this.getBackgroundColor();
        final long ownerId = this.getOwnerId();
        final int n = (int)(ownerId ^ ownerId >>> 32);
        if (this.getExternalUri() != null) {
            hashCode2 = this.getExternalUri().hashCode();
        }
        return ((backgroundColor + (actionLabelResId + (((hashCode * 31 + hashCode3) * 31 + useCircularImage) * 31 + hashCode4) * 31) * 31) * 31 + n) * 31 + hashCode2;
    }
    
    public String toString() {
        final Uri mediaUri = this.getMediaUri();
        final String imageUrl = this.getImageUrl();
        final boolean useCircularImage = this.getUseCircularImage();
        final String description = this.getDescription();
        final int actionLabelResId = this.getActionLabelResId();
        final int backgroundColor = this.getBackgroundColor();
        final long ownerId = this.getOwnerId();
        final Uri externalUri = this.getExternalUri();
        final StringBuilder sb = new StringBuilder();
        sb.append("ImageActivityArgs(mediaUri=");
        sb.append(mediaUri);
        sb.append(", imageUrl=");
        sb.append(imageUrl);
        sb.append(", useCircularImage=");
        lf.z(sb, useCircularImage, ", description=", description, ", actionLabelResId=");
        k1b.j(sb, actionLabelResId, ", backgroundColor=", backgroundColor, ", ownerId=");
        sb.append(ownerId);
        sb.append(", externalUri=");
        sb.append(externalUri);
        sb.append(")");
        return sb.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/navigation/profile/ImageActivityArgs.$serializer", "Ldzb;", "Lcom/twitter/navigation/profile/ImageActivityArgs;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.navigation.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<ImageActivityArgs>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.navigation.profile.ImageActivityArgs", (dzb)(INSTANCE = new $serializer()), 8);
            descriptor2.k("mediaUri", false);
            descriptor2.k("imageUrl", true);
            descriptor2.k("useCircularImage", true);
            descriptor2.k("description", true);
            descriptor2.k("actionLabelResId", true);
            descriptor2.k("backgroundColor", true);
            descriptor2.k("ownerId", true);
            descriptor2.k("externalUri", true);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final l5w b = l5w.b;
            final njr a = njr.a;
            final KSerializer e = BuiltinSerializersKt.e((KSerializer)a);
            final k72 a2 = k72.a;
            final KSerializer e2 = BuiltinSerializersKt.e((KSerializer)a);
            final hud a3 = hud.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)b, e, (KSerializer)a2, e2, (KSerializer)a3, (KSerializer)a3, (KSerializer)mcg.a, BuiltinSerializersKt.e((KSerializer)b) };
        }
        
        public ImageActivityArgs deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            long g = 0L;
            Object n2 = null;
            Object x;
            Object n3 = x = n2;
            int n4 = 0;
            int i = 1;
            boolean b = false;
            int j = 0;
            int k = 0;
            while (i != 0) {
                final int o = c.o(descriptor);
                switch (o) {
                    default: {
                        throw new UnknownFieldException(o);
                    }
                    case 7: {
                        n = c.n(descriptor, 7, (DeserializationStrategy)l5w.b, n);
                        n4 |= 0x80;
                        continue;
                    }
                    case 6: {
                        g = c.g(descriptor, 6);
                        n4 |= 0x40;
                        continue;
                    }
                    case 5: {
                        k = c.j(descriptor, 5);
                        n4 |= 0x20;
                        continue;
                    }
                    case 4: {
                        j = c.j(descriptor, 4);
                        n4 |= 0x10;
                        continue;
                    }
                    case 3: {
                        n2 = c.n(descriptor, 3, (DeserializationStrategy)njr.a, n2);
                        n4 |= 0x8;
                        continue;
                    }
                    case 2: {
                        b = c.B(descriptor, 2);
                        n4 |= 0x4;
                        continue;
                    }
                    case 1: {
                        n3 = c.n(descriptor, 1, (DeserializationStrategy)njr.a, n3);
                        n4 |= 0x2;
                        continue;
                    }
                    case 0: {
                        x = c.x(descriptor, 0, (DeserializationStrategy)l5w.b, x);
                        n4 |= 0x1;
                        continue;
                    }
                    case -1: {
                        i = 0;
                        continue;
                    }
                }
            }
            c.d(descriptor);
            return new ImageActivityArgs(n4, (Uri)x, (String)n3, b, (String)n2, j, k, g, (Uri)n, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final ImageActivityArgs imageActivityArgs) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)imageActivityArgs, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            ImageActivityArgs.write$Self(imageActivityArgs, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
}
