import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfu
{
    public static final a Companion;
    public static final wfu.wfu$b c;
    public final int a;
    public final List<qgv> b;
    
    static {
        Companion = new a();
        c = new wfu.wfu$b();
    }
    
    public wfu(final int a, final List<? extends qgv> b) {
        this.a = a;
        this.b = (List<qgv>)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wfu)) {
            return false;
        }
        final wfu wfu = (wfu)o;
        return this.a == wfu.a && e0e.a((Object)this.b, (Object)wfu.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a * 31;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final List<qgv> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetConversationContext(replyCount=");
        sb.append(a);
        sb.append(", participants=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
