// 
// Decompiled by Procyon v0.6.0
// 

public final class xou
{
    public final cgv a;
    public final ozl b;
    
    public xou(final cgv a, final ozl b) {
        czd.f((Object)b, "reactionType");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof xou)) {
            return false;
        }
        final xou xou = (xou)o;
        return czd.a((Object)this.a, (Object)xou.a) && this.b == xou.b;
    }
    
    @Override
    public final int hashCode() {
        final cgv a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final cgv a = this.a;
        final ozl b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetReactionTimelineEntry(userResult=");
        sb.append(a);
        sb.append(", reactionType=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
