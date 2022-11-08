import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fun
{
    public static final class a extends fun
    {
        public final boolean a;
        public final boolean b;
        public final String c;
        public final String d;
        public final Long e;
        public final boolean f;
        public final Set<AudioSpaceTopicItem> g;
        public final boolean h;
        public final boolean i;
        
        public a(final boolean a, final boolean b, final String c, final String d, final Long e, final boolean f, final Set<AudioSpaceTopicItem> g, final boolean h, final boolean i) {
            zzd.f((Object)g, "topics");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
    }
}
