import java.util.Map;
import java.util.Set;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.p;
import android.util.Log;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppb
{
    public static final ppb a;
    public static c b;
    
    static {
        ppb.b = c.d;
    }
    
    public static final c a(Fragment a1) {
        while (a1 != null) {
            if (a1.d1()) {
                a1.R0();
            }
            a1 = a1.a1;
        }
        return ppb.b;
    }
    
    public static final void b(final c c, final Violation violation) {
        final Fragment f0 = violation.F0;
        final String name = f0.getClass().getName();
        if (c.a.contains(ppb.a.F0)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
            Log.d("FragmentStrictMode", sb.toString(), (Throwable)violation);
        }
        if (c.b != null) {
            e(f0, (Runnable)new npb((Object)c, (Object)violation, 0));
        }
        if (c.a.contains(ppb.a.G0)) {
            e(f0, new opb(name, violation, 0));
        }
    }
    
    public static final void c(final Violation violation) {
        if (p.P(3)) {
            final StringBuilder f = ehk.f("StrictMode violation in ");
            f.append(violation.F0.getClass().getName());
            Log.d("FragmentManager", f.toString(), (Throwable)violation);
        }
    }
    
    public static final void d(final Fragment fragment, final String s) {
        e0e.f((Object)fragment, "fragment");
        e0e.f((Object)s, "previousFragmentId");
        final FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, s);
        c((Violation)fragmentReuseViolation);
        final c a = a(fragment);
        if (a.a.contains(ppb.a.H0) && f(a, fragment.getClass(), ((Violation)fragmentReuseViolation).getClass())) {
            b(a, (Violation)fragmentReuseViolation);
        }
    }
    
    public static final void e(final Fragment fragment, final Runnable runnable) {
        if (fragment.d1()) {
            final Handler i0 = fragment.R0().u.I0;
            e0e.e((Object)i0, "fragment.parentFragmentManager.host.handler");
            if (e0e.a((Object)i0.getLooper(), (Object)Looper.myLooper())) {
                runnable.run();
            }
            else {
                i0.post(runnable);
            }
        }
        else {
            runnable.run();
        }
    }
    
    public static final boolean f(final c c, final Class clazz, final Class clazz2) {
        final Set set = c.c.get(clazz.getName());
        return set == null || ((e0e.a((Object)clazz2.getSuperclass(), (Object)Violation.class) || !rr4.u1((Iterable)set, (Object)clazz2.getSuperclass())) && (set.contains(clazz2) ^ true));
    }
    
    public enum a
    {
        F0, 
        G0, 
        H0, 
        I0, 
        J0, 
        K0, 
        L0, 
        M0;
        
        public static final a[] N0;
    }
    
    public interface b
    {
        void a();
    }
    
    public static final class c
    {
        public static final a Companion;
        public static final c d;
        public final Set<ppb.a> a;
        public final b b;
        public final Map<String, Set<Class<? extends Violation>>> c;
        
        static {
            Companion = new a();
            d = (c)new Object();
        }
        
        public c(final Set<? extends ppb.a> p0, final b p1, final Map<String, ? extends Set<Class<? extends Violation>>> p2) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: astore_1       
            //     4: aload_0        
            //     5: invokespecial   java/lang/Object.<init>:()V
            //     8: aload_0        
            //     9: aload_1        
            //    10: putfield        ppb$c.a:Ljava/util/Set;
            //    13: aload_0        
            //    14: aconst_null    
            //    15: putfield        ppb$c.b:Lppb$b;
            //    18: aload_0        
            //    19: new             Ljava/util/LinkedHashMap;
            //    22: dup            
            //    23: invokespecial   java/util/LinkedHashMap.<init>:()V
            //    26: putfield        ppb$c.c:Ljava/util/LinkedHashMap;
            //    29: return         
            //    Signature:
            //  (Ljava/util/Set<+Lppb$a;>;Lppb$b;Ljava/util/Map<Ljava/lang/String;+Ljava/util/Set<Ljava/lang/Class<+Landroidx/fragment/app/strictmode/Violation;>;>;>;)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 2
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public static final class a
        {
        }
    }
}
