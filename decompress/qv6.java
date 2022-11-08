import java.util.LinkedList;
import java.util.List;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qv6
{
    public int a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public final String h;
    public j10 i;
    public RectF j;
    public final List<String> k;
    
    public qv6(final qv6.qv6$a qv6$a) {
        this.k = new LinkedList();
        this.h = qv6$a.b;
        this.a = 0;
        this.b = qv6$a.c;
        final vlh a = qv6$a.a;
        if (a != null) {
            this.c = a.b;
            this.d = a.c;
            this.g = a.a;
        }
        this.e = qv6$a.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ConvoTreeNode{listPosition=");
        g.append(this.a);
        g.append(", isEntityEnd=");
        g.append(this.b);
        g.append(", isIndentedFromParent=");
        g.append(this.c);
        g.append(", isIndentedFromRoot=");
        g.append(this.d);
        g.append(", isTombstone=");
        g.append(this.e);
        g.append(", hasSibling=");
        g.append(this.f);
        g.append(", parentEntryId='");
        jhd.k(g, this.g, '\'', ", entityId='");
        jhd.k(g, this.h, '\'', ", children=");
        g.append(this.k);
        g.append('}');
        return g.toString();
    }
}
