// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import java.util.List;
import java.util.Arrays;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.Spannable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import android.os.Looper;
import android.os.Handler;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class c
{
    public static final Object j;
    public static volatile c k;
    public final ReentrantReadWriteLock a;
    public final Set<e> b;
    public volatile int c;
    public final Handler d;
    public final a e;
    public final g f;
    public final boolean g;
    public final int h;
    public final androidx.emoji2.text.b i;
    
    static {
        j = new Object();
    }
    
    public c(final c c) {
        final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
        this.a = a;
        this.c = 3;
        this.g = c.b;
        this.f = c.a;
        final int c2 = c.c;
        this.h = c2;
        this.i = c.d;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ft0(0);
        final a e = new a(this);
        this.e = e;
        a.writeLock().lock();
        if (c2 == 0) {
            try {
                this.c = 0;
            }
            finally {
                this.a.writeLock().unlock();
            }
        }
        a.writeLock().unlock();
        if (this.b() == 0) {
            e.a();
        }
    }
    
    public static c a() {
        synchronized (c.j) {
            final c k = c.k;
            ri4.v(k != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            return k;
        }
    }
    
    public static c c(final c c) {
        c c2;
        if ((c2 = c.k) == null) {
            synchronized (c.j) {
                if ((c2 = c.k) == null) {
                    c2 = (c.k = new c(c));
                }
            }
        }
        return c2;
    }
    
    public static boolean d() {
        return c.k != null;
    }
    
    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        }
        finally {
            this.a.readLock().unlock();
        }
    }
    
    public final boolean e() {
        final int b = this.b();
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        return b2;
    }
    
    public final void f() {
        final int h = this.h;
        boolean b = true;
        if (h != 1) {
            b = false;
        }
        ri4.v(b, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (this.e()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            final a e = this.e;
            Objects.requireNonNull(e);
            try {
                ((b)e).a.f.b(new h() {
                    @Override
                    public final void a(final Throwable t) {
                        androidx.emoji2.text.c.a.this.a.g(t);
                    }
                    
                    @Override
                    public final void b(final androidx.emoji2.text.h c) {
                        final a a = androidx.emoji2.text.c.a.this;
                        if (c == null) {
                            a.a.g(new IllegalArgumentException("metadataRepo cannot be null"));
                        }
                        else {
                            a.c = c;
                            a.b = new androidx.emoji2.text.e(a.c, new i(), a.a.i);
                            a.a.h();
                        }
                    }
                });
            }
            finally {
                final Throwable t;
                ((b)e).a.g(t);
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final void g(final Throwable t) {
        final ArrayList list = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            list.addAll((Collection)this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post((Runnable)new f(list, this.c, t));
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final void h() {
        final ArrayList list = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            list.addAll((Collection)this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post((Runnable)new f(list, this.c, null));
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final CharSequence i(final CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        }
        else {
            length = charSequence.length();
        }
        return this.j(charSequence, 0, length);
    }
    
    public final CharSequence j(final CharSequence charSequence, int n, int max) {
        int min = n;
        ri4.v(this.e(), "Not initialized yet");
        ri4.p(min, "start cannot be negative");
        ri4.p(max, "end cannot be negative");
        ri4.p(Integer.MAX_VALUE, "maxEmojiCount cannot be negative");
        ri4.m(min <= max, (Object)"start should be <= than end");
        final yzv yzv = null;
        if (charSequence == null) {
            return null;
        }
        ri4.m(min <= charSequence.length(), (Object)"start should be < than charSequence length");
        ri4.m(max <= charSequence.length(), (Object)"end should be < than charSequence length");
        if (charSequence.length() != 0) {
            if (min != max) {
                final boolean g = this.g;
                final androidx.emoji2.text.e b = this.e.b;
                Objects.requireNonNull(b);
                final boolean b2 = charSequence instanceof rzq;
                if (b2) {
                    ((rzq)charSequence).a();
                }
                Label_0241: {
                    if (b2) {
                        break Label_0241;
                    }
                    try {
                        yzv yzv2;
                        if (charSequence instanceof Spannable) {
                            yzv2 = new yzv((Spannable)charSequence);
                        }
                        else {
                            yzv2 = yzv;
                            if (charSequence instanceof Spanned) {
                                yzv2 = yzv;
                                if (((Spanned)charSequence).nextSpanTransition(min - 1, max + 1, (Class)s1a.class) <= max) {
                                    yzv2 = new yzv(charSequence);
                                }
                            }
                        }
                        n = min;
                        int n2 = max;
                        if (yzv2 != null) {
                            final s1a[] array = (s1a[])yzv2.getSpans(min, max, (Class)s1a.class);
                            n = min;
                            n2 = max;
                            if (array != null) {
                                n = min;
                                n2 = max;
                                if (array.length > 0) {
                                    final int length = array.length;
                                    int n3 = 0;
                                    while (true) {
                                        n = min;
                                        n2 = max;
                                        if (n3 >= length) {
                                            break;
                                        }
                                        final s1a s1a = array[n3];
                                        final int spanStart = yzv2.getSpanStart((Object)s1a);
                                        n = yzv2.getSpanEnd((Object)s1a);
                                        if (spanStart != max) {
                                            yzv2.removeSpan((Object)s1a);
                                        }
                                        min = Math.min(spanStart, min);
                                        max = Math.max(n, max);
                                        ++n3;
                                    }
                                }
                            }
                        }
                        if (n != n2 && n < charSequence.length()) {
                            final androidx.emoji2.text.e.a a = new androidx.emoji2.text.e.a(b.b.c);
                            int codePoint = Character.codePointAt(charSequence, n);
                            int n4 = 0;
                            max = n;
                            int n5 = 0;
                        Label_0432:
                            while (true) {
                                n = codePoint;
                                n5 = max;
                                while (max < n2 && n4 < Integer.MAX_VALUE) {
                                    final int a2 = a.a(n);
                                    int n7;
                                    if (a2 != 1) {
                                        if (a2 != 2) {
                                            if (a2 == 3) {
                                                int n6 = 0;
                                                yzv yzv3 = null;
                                                Label_0598: {
                                                    if (!g) {
                                                        n6 = n4;
                                                        yzv3 = yzv2;
                                                        if (b.b(charSequence, n5, max, a.d.b)) {
                                                            break Label_0598;
                                                        }
                                                    }
                                                    if ((yzv3 = yzv2) == null) {
                                                        yzv3 = new yzv((Spannable)new SpannableString(charSequence));
                                                    }
                                                    final n1a b3 = a.d.b;
                                                    Objects.requireNonNull(b.a);
                                                    yzv3.setSpan((Object)new tlv(b3), n5, max, 33);
                                                    n6 = n4 + 1;
                                                }
                                                n4 = n6;
                                                yzv2 = yzv3;
                                                codePoint = n;
                                                continue Label_0432;
                                            }
                                            n7 = n5;
                                        }
                                        else {
                                            final int n8 = max += Character.charCount(n);
                                            n7 = n5;
                                            if (n8 < n2) {
                                                n = Character.codePointAt(charSequence, n8);
                                                n7 = n5;
                                                max = n8;
                                            }
                                        }
                                    }
                                    else {
                                        n7 = n5 + Character.charCount(Character.codePointAt(charSequence, n5));
                                        if (n7 < n2) {
                                            n = Character.codePointAt(charSequence, n7);
                                        }
                                        max = n7;
                                    }
                                    n5 = n7;
                                }
                                break;
                            }
                            yzv yzv4 = yzv2;
                            Label_0804: {
                                if (a.b()) {
                                    yzv4 = yzv2;
                                    if (n4 < Integer.MAX_VALUE) {
                                        if (!g) {
                                            yzv4 = yzv2;
                                            if (b.b(charSequence, n5, max, a.c.b)) {
                                                break Label_0804;
                                            }
                                        }
                                        if ((yzv4 = yzv2) == null) {
                                            yzv4 = new yzv(charSequence);
                                        }
                                        final n1a b4 = a.c.b;
                                        Objects.requireNonNull(b.a);
                                        yzv4.setSpan((Object)new tlv(b4), n5, max, 33);
                                    }
                                }
                            }
                            if (yzv4 != null) {
                                Object d0;
                                final Spannable spannable = (Spannable)(d0 = yzv4.D0);
                                if (b2) {
                                    ((rzq)charSequence).b();
                                    d0 = spannable;
                                    return (CharSequence)d0;
                                }
                                return (CharSequence)d0;
                            }
                            else if (!b2) {
                                return charSequence;
                            }
                        }
                        else if (!b2) {
                            return charSequence;
                        }
                        ((rzq)charSequence).b();
                        Object d0 = charSequence;
                        return (CharSequence)d0;
                    }
                    finally {
                        if (b2) {
                            ((rzq)charSequence).b();
                        }
                    }
                }
            }
        }
        return charSequence;
    }
    
    public final void k(final e e) {
        ri4.r((Object)e, (Object)"initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add((Object)e);
            }
            else {
                this.d.post((Runnable)new f(Arrays.asList(e), this.c, null));
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public static final class a extends b
    {
        public volatile androidx.emoji2.text.e b;
        public volatile androidx.emoji2.text.h c;
        
        public a(final c c) {
            super(c);
        }
        
        public final void a() {
            try {
                super.a.f.b(new h() {
                    @Override
                    public final void a(final Throwable t) {
                        e.a.g(t);
                    }
                    
                    @Override
                    public final void b(final androidx.emoji2.text.h c) {
                        final a a = e;
                        if (c == null) {
                            a.a.g(new IllegalArgumentException("metadataRepo cannot be null"));
                        }
                        else {
                            a.c = c;
                            a.b = new androidx.emoji2.text.e(a.c, new i(), a.a.i);
                            a.a.h();
                        }
                    }
                });
            }
            finally {
                final Throwable t;
                super.a.g(t);
            }
        }
    }
    
    public static class b
    {
        public final c a;
        
        public b(final c a) {
            this.a = a;
        }
    }
    
    public abstract static class c
    {
        public final g a;
        public boolean b;
        public int c;
        public androidx.emoji2.text.b d;
        
        public c(final g a) {
            this.c = 0;
            this.d = new androidx.emoji2.text.b();
            this.a = a;
        }
    }
    
    public interface d
    {
    }
    
    public abstract static class e
    {
        public void a() {
        }
        
        public void b() {
        }
    }
    
    public static final class f implements Runnable
    {
        public final List<e> C0;
        public final Throwable D0;
        public final int E0;
        
        public f(final Collection<e> collection, final int e0, final Throwable d0) {
            ri4.r((Object)collection, (Object)"initCallbacks cannot be null");
            this.C0 = new ArrayList((Collection<? extends E>)collection);
            this.E0 = e0;
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            final int size = this.C0.size();
            final int e0 = this.E0;
            int i = 0;
            final int n = 0;
            if (e0 != 1) {
                for (int j = n; j < size; ++j) {
                    ((e)this.C0.get(j)).a();
                }
            }
            else {
                while (i < size) {
                    ((e)this.C0.get(i)).b();
                    ++i;
                }
            }
        }
    }
    
    public interface g
    {
        void b(final h p0);
    }
    
    public abstract static class h
    {
        public abstract void a(final Throwable p0);
        
        public abstract void b(final androidx.emoji2.text.h p0);
    }
    
    public static final class i
    {
    }
}
