// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.text.Spanned;
import android.util.SparseArray;
import android.text.Selection;
import android.view.KeyEvent;
import android.text.Editable;

public final class e
{
    public final c.i a;
    public final h b;
    public c.d c;
    
    public e(final h b, final c.i a, final c.d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static boolean a(final Editable editable, final KeyEvent keyEvent, final boolean b) {
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) ^ true) {
            return false;
        }
        final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        final s1a[] array = (s1a[])((Spanned)editable).getSpans(selectionStart, selectionEnd, (Class)s1a.class);
        if (array != null && array.length > 0) {
            for (final s1a s1a : array) {
                final int spanStart = ((Spanned)editable).getSpanStart((Object)s1a);
                final int spanEnd = ((Spanned)editable).getSpanEnd((Object)s1a);
                if ((b && spanStart == selectionStart) || (!b && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd)) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean b(final CharSequence charSequence, int c, final int n, final n1a n1a) {
        final int c2 = n1a.c;
        boolean b = true;
        if (c2 == 0) {
            final c.d c3 = this.c;
            final i9h f = n1a.f();
            final int a = ((e9s)f).a(8);
            int short1;
            if (a != 0) {
                short1 = ((e9s)f).b.getShort(a + ((e9s)f).a);
            }
            else {
                short1 = 0;
            }
            if (((b)c3).a(charSequence, c, n, short1)) {
                c = 2;
            }
            else {
                c = 1;
            }
            n1a.c = c;
        }
        if (n1a.c != 2) {
            b = false;
        }
        return b;
    }
    
    public static final class a
    {
        public int a;
        public final h.a b;
        public h.a c;
        public h.a d;
        public int e;
        public int f;
        
        public a(final h.a a) {
            this.a = 1;
            this.b = a;
            this.c = a;
        }
        
        public final int a(final int e) {
            final SparseArray<h.a> a = this.c.a;
            h.a a2;
            if (a == null) {
                a2 = null;
            }
            else {
                a2 = (h.a)a.get(e);
            }
            final int a3 = this.a;
            final int n = 3;
            int n4 = 0;
            Label_0210: {
                Label_0208: {
                    if (a3 != 2) {
                        if (a2 == null) {
                            this.c();
                            break Label_0208;
                        }
                        this.a = 2;
                        this.c = a2;
                        this.f = 1;
                    }
                    else if (a2 != null) {
                        this.c = a2;
                        ++this.f;
                    }
                    else {
                        final int n2 = 0;
                        if (e == 65038) {
                            this.c();
                            break Label_0208;
                        }
                        int n3 = n2;
                        if (e == 65039) {
                            n3 = 1;
                        }
                        if (n3 == 0) {
                            final h.a c = this.c;
                            if (c.b == null) {
                                this.c();
                                break Label_0208;
                            }
                            if (this.f != 1) {
                                this.d = c;
                                this.c();
                                n4 = n;
                                break Label_0210;
                            }
                            if (this.d()) {
                                this.d = this.c;
                                this.c();
                                n4 = n;
                                break Label_0210;
                            }
                            this.c();
                            break Label_0208;
                        }
                    }
                    n4 = 2;
                    break Label_0210;
                }
                n4 = 1;
            }
            this.e = e;
            return n4;
        }
        
        public final boolean b() {
            final int a = this.a;
            final boolean b = true;
            if (a == 2 && this.c.b != null) {
                boolean b2 = b;
                if (this.f > 1) {
                    return b2;
                }
                if (this.d()) {
                    b2 = b;
                    return b2;
                }
            }
            return false;
        }
        
        public final void c() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
        }
        
        public final boolean d() {
            final i9h f = this.c.b.f();
            final int a = ((e9s)f).a(6);
            return (a != 0 && ((e9s)f).b.get(a + ((e9s)f).a) != 0) || this.e == 65039;
        }
    }
}
