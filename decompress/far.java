import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class far
{
    public final CharSequence a;
    public final int b;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final TextDirectionHeuristic f;
    public final Layout$Alignment g;
    public final int h;
    public final TextUtils$TruncateAt i;
    public final int j;
    public final float k;
    public final float l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int[] t;
    public final int[] u;
    
    public far(final CharSequence a, int length, final int c, final TextPaint d, final int e, final TextDirectionHeuristic f, final Layout$Alignment g, final int h, final TextUtils$TruncateAt i, final int j, final float k, final float l, int m, final boolean n, final boolean o, final int p21, final int q, final int r, final int s, final int[] t, final int[] u) {
        czd.f((Object)a, "text");
        czd.f((Object)d, "paint");
        czd.f((Object)f, "textDir");
        czd.f((Object)g, "alignment");
        this.a = a;
        this.b = length;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p21;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        m = 1;
        if (length >= 0 && length <= c) {
            length = 1;
        }
        else {
            length = 0;
        }
        if (length == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        length = a.length();
        if (c >= 0 && c <= length) {
            length = 1;
        }
        else {
            length = 0;
        }
        if (length == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (h >= 0) {
            length = 1;
        }
        else {
            length = 0;
        }
        if (length == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (e >= 0) {
            length = 1;
        }
        else {
            length = 0;
        }
        if (length == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (j >= 0) {
            length = 1;
        }
        else {
            length = 0;
        }
        if (length == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (k >= 0.0f) {
            length = m;
        }
        else {
            length = 0;
        }
        if (length != 0) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
