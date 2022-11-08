// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.util.SparseArray;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import android.graphics.Typeface;

public final class h
{
    public final j9h a;
    public final char[] b;
    public final a c;
    public final Typeface d;
    
    public h(final Typeface d, final j9h a) {
        this.d = d;
        this.a = a;
        this.c = new a(1024);
        this.b = new char[a.d() * 2];
        for (int d2 = a.d(), i = 0; i < d2; ++i) {
            final n1a n1a = new n1a(this, i);
            Character.toChars(n1a.e(), this.b, i * 2);
            ri4.m(n1a.b() > 0, (Object)"invalid metadata codepoint length");
            this.c.a(n1a, 0, n1a.b() - 1);
        }
    }
    
    public static h a(final Typeface typeface, ByteBuffer duplicate) throws IOException {
        try {
            final Method b = vut.b;
            vut$a.a("EmojiCompat.MetadataRepo.create");
            duplicate = duplicate.duplicate();
            duplicate.position((int)k9h.a((k9h$d)new k9h$a(duplicate)).a);
            final h h = new h(typeface, j9h.c(duplicate));
            vut$a.b();
            return h;
        }
        finally {
            final Method b2 = vut.b;
            vut$a.b();
        }
    }
    
    public static final class a
    {
        public final SparseArray<a> a;
        public n1a b;
        
        public a() {
            this.a = (SparseArray<a>)new SparseArray(1);
        }
        
        public a(final int n) {
            this.a = (SparseArray<a>)new SparseArray(1024);
        }
        
        public final void a(final n1a b, final int n, final int n2) {
            final int a = b.a(n);
            final SparseArray<a> a2 = this.a;
            a a3;
            if (a2 == null) {
                a3 = null;
            }
            else {
                a3 = (a)a2.get(a);
            }
            a a4 = a3;
            if (a3 == null) {
                a4 = new a();
                this.a.put(b.a(n), (Object)a4);
            }
            if (n2 > n) {
                a4.a(b, n + 1, n2);
            }
            else {
                a4.b = b;
            }
        }
    }
}
