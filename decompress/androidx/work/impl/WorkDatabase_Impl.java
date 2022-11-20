// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import android.content.Context;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import androidx.room.c;

public final class WorkDatabase_Impl extends WorkDatabase
{
    public volatile tsx n;
    public volatile ro8 o;
    public volatile wsx p;
    public volatile v5s q;
    public volatile fsx r;
    public volatile jsx s;
    public volatile gvk t;
    public volatile txl u;
    
    public final c e() {
        return new c((tcn)this, new HashMap<String, String>(0), new HashMap<String, Set<String>>(0), new String[] { "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference" });
    }
    
    public final mzr f(final v88 v88) {
        final itn itn = new itn(v88, (itn.a)new WorkDatabase_Impl$a(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        final Context b = v88.b;
        final String c = v88.c;
        if (b != null) {
            return v88.a.a(new mzr$b(b, c, (mzr$a)itn, false, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }
    
    public final List<iah> g(final Map<Class<? extends n71>, n71> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Liah;
        //     4: dup            
        //     5: iconst_0       
        //     6: new             Lhrx;
        //     9: dup            
        //    10: invokespecial   hrx.<init>:()V
        //    13: aastore        
        //    14: dup            
        //    15: iconst_1       
        //    16: new             Lirx;
        //    19: dup            
        //    20: invokespecial   irx.<init>:()V
        //    23: aastore        
        //    24: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //    27: areturn        
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/Class<+Ln71;>;Ln71;>;)Ljava/util/List<Liah;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 1
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    public final Set<Class<? extends n71>> h() {
        return new HashSet<Class<? extends n71>>();
    }
    
    public final Map<Class<?>, List<Class<?>>> i() {
        final HashMap hashMap = new HashMap();
        hashMap.put(ssx.class, Collections.emptyList());
        hashMap.put(qo8.class, Collections.emptyList());
        hashMap.put(vsx.class, Collections.emptyList());
        hashMap.put(u5s.class, Collections.emptyList());
        hashMap.put(esx.class, Collections.emptyList());
        hashMap.put(isx.class, Collections.emptyList());
        hashMap.put(fvk.class, Collections.emptyList());
        hashMap.put(sxl.class, Collections.emptyList());
        return hashMap;
    }
    
    public final qo8 s() {
        if (this.o != null) {
            return (qo8)this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new ro8((tcn)this);
            }
            return (qo8)this.o;
        }
    }
    
    public final fvk t() {
        if (this.t != null) {
            return (fvk)this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new gvk((tcn)this);
            }
            return (fvk)this.t;
        }
    }
    
    public final sxl u() {
        if (this.u != null) {
            return (sxl)this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new txl((tcn)this);
            }
            return (sxl)this.u;
        }
    }
    
    public final u5s v() {
        if (this.q != null) {
            return (u5s)this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new v5s((tcn)this);
            }
            return (u5s)this.q;
        }
    }
    
    public final esx w() {
        if (this.r != null) {
            return (esx)this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new fsx((tcn)this);
            }
            return (esx)this.r;
        }
    }
    
    public final isx x() {
        if (this.s != null) {
            return (isx)this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new jsx((tcn)this);
            }
            return (isx)this.s;
        }
    }
    
    public final ssx y() {
        if (this.n != null) {
            return (ssx)this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new tsx((tcn)this);
            }
            return (ssx)this.n;
        }
    }
    
    public final vsx z() {
        if (this.p != null) {
            return (vsx)this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new wsx((tcn)this);
            }
            return (vsx)this.p;
        }
    }
}
