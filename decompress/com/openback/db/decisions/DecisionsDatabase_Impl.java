// 
// Decompiled by Procyon v0.6.0
// 

package com.openback.db.decisions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import android.content.Context;
import java.util.Map;
import java.util.HashMap;
import androidx.room.c;

public final class DecisionsDatabase_Impl extends DecisionsDatabase
{
    public volatile o6q n;
    public volatile sps o;
    
    public final void d() {
        ((gcn)this).a();
        final tyr h2 = ((gcn)this).d.H2();
        try {
            ((gcn)this).c();
            h2.x("DELETE FROM `signals`");
            h2.x("DELETE FROM `times`");
            ((gcn)this).q();
        }
        finally {
            ((gcn)this).l();
            h2.t("PRAGMA wal_checkpoint(FULL)").close();
            if (!h2.h3()) {
                h2.x("VACUUM");
            }
        }
    }
    
    public final c e() {
        return new c((gcn)this, (Map)new HashMap(0), (Map)new HashMap(0), new String[] { "signals", "times" });
    }
    
    public final uyr f(final l98 l98) {
        final usn usn = new usn(l98, (usn$a)new DecisionsDatabase_Impl$a(this), "3cde3f5675a37f6889ee513f4e1dc55e", "6abf392f29479dcb8e9b165c5747e089");
        final Context b = l98.b;
        final String c = l98.c;
        if (b != null) {
            return l98.a.a(new uyr.b(b, c, (uyr.a)usn, false, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }
    
    public final List<gah> g(final Map<Class<? extends u71>, u71> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Lgah;
        //     4: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //     7: areturn        
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/Class<+Lu71;>;Lu71;>;)Ljava/util/List<Lgah;>;
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
    
    public final Set<Class<? extends u71>> h() {
        return new HashSet<Class<? extends u71>>();
    }
    
    public final Map<Class<?>, List<Class<?>>> i() {
        final HashMap hashMap = new HashMap();
        hashMap.put(n6q.class, Collections.emptyList());
        hashMap.put(rps.class, Collections.emptyList());
        return hashMap;
    }
    
    public final n6q s() {
        if (this.n != null) {
            return (n6q)this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new o6q((gcn)this);
            }
            return (n6q)this.n;
        }
    }
    
    public final rps t() {
        if (this.o != null) {
            return (rps)this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new sps((gcn)this);
            }
            return (rps)this.o;
        }
    }
}
