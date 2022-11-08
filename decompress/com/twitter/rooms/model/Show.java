// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BI\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b2\u00103Bg\b\u0017\u0012\u0006\u00104\u001a\u00020\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\tH\u00c6\u0003J[\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001c\u001a\u00020\tH\u00c6\u0001J\t\u0010\u001e\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\fH\u00d6\u0001J\u0013\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\u0019\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b-\u0010$R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b1\u0010$¨\u0006:" }, d2 = { "Lcom/twitter/rooms/model/Show;", "", "self", "Lsd6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loyv;", "write$Self", "", "component1", "component2", "", "component3", "component4", "", "component5", "component6", "Lcom/twitter/rooms/model/Guest;", "component7", "component8", "artUrl", "id", "listenScore", "title", "following", "twitterHandle", "guest", "description", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getArtUrl", "()Ljava/lang/String;", "getId", "I", "getListenScore", "()I", "getTitle", "Z", "getFollowing", "()Z", "getTwitterHandle", "Lcom/twitter/rooms/model/Guest;", "getGuest", "()Lcom/twitter/rooms/model/Guest;", "getDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Lcom/twitter/rooms/model/Guest;Ljava/lang/String;)V", "seen1", "Lqkp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Lcom/twitter/rooms/model/Guest;Ljava/lang/String;Lqkp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
@okp
public final class Show
{
    public static final Companion Companion;
    private final String artUrl = artUrl;
    private final String description = description;
    private final boolean following = following;
    private final Guest guest = guest;
    private final String id = id;
    private final int listenScore = listenScore;
    private final String title = title;
    private final String twitterHandle = twitterHandle;
    
    static {
        Companion = new Companion();
    }
    
    public Show(final String artUrl, final String id, final int listenScore, final String title, final boolean following, final String twitterHandle, final Guest guest, final String description) {
        zzd.f((Object)artUrl, "artUrl");
        zzd.f((Object)id, "id");
        zzd.f((Object)title, "title");
        zzd.f((Object)twitterHandle, "twitterHandle");
        zzd.f((Object)description, "description");
        this.artUrl = artUrl;
        this.id = id;
        this.listenScore = listenScore;
        this.title = title;
        this.following = following;
        this.twitterHandle = twitterHandle;
        this.guest = guest;
        this.description = description;
    }
    
    public static final void write$Self(final Show show, final sd6 sd6, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)show, "self");
        zzd.f((Object)sd6, "output");
        zzd.f((Object)serialDescriptor, "serialDesc");
        sd6.S(serialDescriptor, 0, show.artUrl);
        sd6.S(serialDescriptor, 1, show.id);
        sd6.Q(serialDescriptor, 2, show.listenScore);
        sd6.S(serialDescriptor, 3, show.title);
        sd6.R(serialDescriptor, 4, show.following);
        sd6.S(serialDescriptor, 5, show.twitterHandle);
        sd6.x(serialDescriptor, 6, (skp)Guest.$serializer.INSTANCE, (Object)show.guest);
        sd6.S(serialDescriptor, 7, show.description);
    }
    
    public final String component1() {
        return this.artUrl;
    }
    
    public final String component2() {
        return this.id;
    }
    
    public final int component3() {
        return this.listenScore;
    }
    
    public final String component4() {
        return this.title;
    }
    
    public final boolean component5() {
        return this.following;
    }
    
    public final String component6() {
        return this.twitterHandle;
    }
    
    public final Guest component7() {
        return this.guest;
    }
    
    public final String component8() {
        return this.description;
    }
    
    public final Show copy(final String s, final String s2, final int n, final String s3, final boolean b, final String s4, final Guest guest, final String s5) {
        zzd.f((Object)s, "artUrl");
        zzd.f((Object)s2, "id");
        zzd.f((Object)s3, "title");
        zzd.f((Object)s4, "twitterHandle");
        zzd.f((Object)s5, "description");
        return new Show(s, s2, n, s3, b, s4, guest, s5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Show)) {
            return false;
        }
        final Show show = (Show)o;
        return zzd.a((Object)this.artUrl, (Object)show.artUrl) && zzd.a((Object)this.id, (Object)show.id) && this.listenScore == show.listenScore && zzd.a((Object)this.title, (Object)show.title) && this.following == show.following && zzd.a((Object)this.twitterHandle, (Object)show.twitterHandle) && zzd.a((Object)this.guest, (Object)show.guest) && zzd.a((Object)this.description, (Object)show.description);
    }
    
    public final String getArtUrl() {
        return this.artUrl;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final boolean getFollowing() {
        return this.following;
    }
    
    public final Guest getGuest() {
        return this.guest;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final int getListenScore() {
        return this.listenScore;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getTwitterHandle() {
        return this.twitterHandle;
    }
    
    @Override
    public int hashCode() {
        final int a = l7k.a(this.title, (l7k.a(this.id, this.artUrl.hashCode() * 31, 31) + this.listenScore) * 31, 31);
        int following;
        if ((following = (this.following ? 1 : 0)) != 0) {
            following = 1;
        }
        final int a2 = l7k.a(this.twitterHandle, (a + following) * 31, 31);
        final Guest guest = this.guest;
        int hashCode;
        if (guest == null) {
            hashCode = 0;
        }
        else {
            hashCode = guest.hashCode();
        }
        return this.description.hashCode() + (a2 + hashCode) * 31;
    }
    
    @Override
    public String toString() {
        final String artUrl = this.artUrl;
        final String id = this.id;
        final int listenScore = this.listenScore;
        final String title = this.title;
        final boolean following = this.following;
        final String twitterHandle = this.twitterHandle;
        final Guest guest = this.guest;
        final String description = this.description;
        final StringBuilder y = mb0.y("Show(artUrl=", artUrl, ", id=", id, ", listenScore=");
        y70.B(y, listenScore, ", title=", title, ", following=");
        lf.z(y, following, ", twitterHandle=", twitterHandle, ", guest=");
        y.append(guest);
        y.append(", description=");
        y.append(description);
        y.append(")");
        return y.toString();
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "com/twitter/rooms/model/Show.$serializer", "Ldzb;", "Lcom/twitter/rooms/model/Show;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loyv;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class $serializer implements dzb<Show>
    {
        public static final $serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        static {
            final kok descriptor2 = new kok("com.twitter.rooms.model.Show", (dzb)(INSTANCE = new $serializer()), 8);
            descriptor2.k("artUrl", false);
            descriptor2.k("id", false);
            descriptor2.k("listenScore", false);
            descriptor2.k("title", false);
            descriptor2.k("following", false);
            descriptor2.k("twitterHandle", false);
            descriptor2.k("guest", false);
            descriptor2.k("description", false);
            descriptor = (SerialDescriptor)descriptor2;
        }
        
        private $serializer() {
        }
        
        public KSerializer<?>[] childSerializers() {
            final njr a = njr.a;
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)a, (KSerializer)a, (KSerializer)hud.a, (KSerializer)a, (KSerializer)k72.a, (KSerializer)a, BuiltinSerializersKt.e((KSerializer)Guest.$serializer.INSTANCE), (KSerializer)a };
        }
        
        public Show deserialize(final Decoder decoder) {
            zzd.f((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            final qd6 c = decoder.c(descriptor);
            c.p();
            Object n = null;
            String m = null;
            String j;
            String i = j = m;
            String l;
            String k = l = j;
            int n2 = 1;
            int n3 = 0;
            int j2 = 0;
            boolean b = false;
            while (n2 != 0) {
                final int o = c.o(descriptor);
                switch (o) {
                    default: {
                        throw new UnknownFieldException(o);
                    }
                    case 7: {
                        l = c.m(descriptor, 7);
                        n3 |= 0x80;
                        continue;
                    }
                    case 6: {
                        n = c.n(descriptor, 6, (DeserializationStrategy)Guest.$serializer.INSTANCE, n);
                        n3 |= 0x40;
                        continue;
                    }
                    case 5: {
                        k = c.m(descriptor, 5);
                        n3 |= 0x20;
                        continue;
                    }
                    case 4: {
                        b = c.B(descriptor, 4);
                        n3 |= 0x10;
                        continue;
                    }
                    case 3: {
                        j = c.m(descriptor, 3);
                        n3 |= 0x8;
                        continue;
                    }
                    case 2: {
                        j2 = c.j(descriptor, 2);
                        n3 |= 0x4;
                        continue;
                    }
                    case 1: {
                        i = c.m(descriptor, 1);
                        n3 |= 0x2;
                        continue;
                    }
                    case 0: {
                        m = c.m(descriptor, 0);
                        n3 |= 0x1;
                        continue;
                    }
                    case -1: {
                        n2 = 0;
                        continue;
                    }
                }
            }
            c.d(descriptor);
            return new Show(n3, m, i, j2, j, b, k, (Guest)n, l, null);
        }
        
        public SerialDescriptor getDescriptor() {
            return $serializer.descriptor;
        }
        
        public void serialize(final Encoder encoder, final Show show) {
            zzd.f((Object)encoder, "encoder");
            zzd.f((Object)show, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final sd6 c = encoder.c(descriptor);
            Show.write$Self(show, c, descriptor);
            c.d(descriptor);
        }
        
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])bp7.R0;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/model/Show$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/twitter/rooms/model/Show;", "serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        public final KSerializer<Show> serializer() {
            return (KSerializer<Show>)$serializer.INSTANCE;
        }
    }
}
