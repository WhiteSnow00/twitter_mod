import android.view.View;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5b
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public List<Integer> n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    
    public q5b() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.n = new ArrayList();
    }
    
    public final void a(final View view, int n, int n2, final int n3, final int n4) {
        final p5b p5b = (p5b)view.getLayoutParams();
        this.a = Math.min(this.a, view.getLeft() - p5b.D2() - n);
        this.b = Math.min(this.b, view.getTop() - p5b.Q0() - n2);
        n2 = this.c;
        n = view.getRight();
        this.c = Math.max(n2, p5b.n3() + n + n3);
        n2 = this.d;
        n = view.getBottom();
        this.d = Math.max(n2, p5b.A2() + n + n4);
    }
}
