import com.twitter.rooms.model.PodcastEpisode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d1o
{
    public final rv1<a> a;
    public final zml<c> b;
    public final zml<b> c;
    
    public d1o() {
        this.a = (rv1<a>)new rv1();
        this.b = (zml<c>)new zml();
        this.c = (zml<b>)new zml();
    }
    
    public abstract static class a
    {
        public static final class a extends d1o.a
        {
            public static final a a;
            
            static {
                a = new a();
            }
        }
        
        public static final class b extends d1o.a
        {
            public final v21 a;
            public final x21 b;
            
            public b(final v21 a, final x21 b) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof b)) {
                    return false;
                }
                final b b = (b)o;
                return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b);
            }
            
            @Override
            public final int hashCode() {
                return this.b.hashCode() + this.a.hashCode() * 31;
            }
            
            @Override
            public final String toString() {
                final v21 a = this.a;
                final x21 b = this.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("Dock(audiospace=");
                sb.append(a);
                sb.append(", participants=");
                sb.append(b);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class c extends d1o.a
        {
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final Long e;
            public final String f;
            public final boolean g;
            public final int h;
            
            public c(final String a, final String b, final String c, final String d, final Long e, final String f, final boolean g, final int h) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e;
                this.f = f;
                this.g = g;
                this.h = h;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof c)) {
                    return false;
                }
                final c c = (c)o;
                return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b) && zzd.a((Object)this.c, (Object)c.c) && zzd.a((Object)this.d, (Object)c.d) && zzd.a((Object)this.e, (Object)c.e) && zzd.a((Object)this.f, (Object)c.f) && this.g == c.g && this.h == c.h;
            }
            
            @Override
            public final int hashCode() {
                final String a = this.a;
                int hashCode = 0;
                int hashCode2;
                if (a == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = a.hashCode();
                }
                final String b = this.b;
                int hashCode3;
                if (b == null) {
                    hashCode3 = 0;
                }
                else {
                    hashCode3 = b.hashCode();
                }
                final String c = this.c;
                int hashCode4;
                if (c == null) {
                    hashCode4 = 0;
                }
                else {
                    hashCode4 = c.hashCode();
                }
                final String d = this.d;
                int hashCode5;
                if (d == null) {
                    hashCode5 = 0;
                }
                else {
                    hashCode5 = d.hashCode();
                }
                final Long e = this.e;
                int hashCode6;
                if (e == null) {
                    hashCode6 = 0;
                }
                else {
                    hashCode6 = e.hashCode();
                }
                final String f = this.f;
                if (f != null) {
                    hashCode = f.hashCode();
                }
                int g;
                if ((g = (this.g ? 1 : 0)) != 0) {
                    g = 1;
                }
                return ((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode) * 31 + g) * 31 + this.h;
            }
            
            @Override
            public final String toString() {
                final String a = this.a;
                final String b = this.b;
                final String c = this.c;
                final String d = this.d;
                final Long e = this.e;
                final String f = this.f;
                final boolean g = this.g;
                final int h = this.h;
                final StringBuilder y = mb0.y("ExpandedView(hostTwitterId=", a, ", hostDisplayName=", b, ", hostAvatarUrl=");
                mag.m(y, c, ", title=", d, ", spaceStartTimeMs=");
                y.append(e);
                y.append(", roomId=");
                y.append(f);
                y.append(", isSpaceAvailableForClipping=");
                y.append(g);
                y.append(", totalParticipated=");
                y.append(h);
                y.append(")");
                return y.toString();
            }
        }
        
        public static final class d extends d1o.a
        {
            public final PodcastEpisode a;
            
            public d(final PodcastEpisode a) {
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof d && zzd.a((Object)this.a, (Object)((d)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final PodcastEpisode a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("OpenPodcastDock(podcastEpisode=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
    }
}
