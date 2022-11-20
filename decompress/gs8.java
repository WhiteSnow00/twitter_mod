import java.util.Iterator;
import com.twitter.database.schema.GlobalSchema;
import java.io.IOException;
import com.twitter.model.json.contacts.JsonContactIds;
import com.twitter.util.user.UserIdentifier;
import java.util.List;
import android.content.Context;
import com.twitter.model.json.contacts.JsonDestroyContactResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gs8 extends d2v<JsonDestroyContactResponse>
{
    public final Context j1;
    public final List<Long> k1;
    public final UserIdentifier l1;
    public final boolean m1;
    
    public gs8(final Context p0, final UserIdentifier p1, final List<Long> p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: iconst_0       
        //     3: invokespecial   d2v.<init>:(Lcom/twitter/util/user/UserIdentifier;I)V
        //     6: aload_0        
        //     7: aload_1        
        //     8: putfield        gs8.j1:Landroid/content/Context;
        //    11: aload_0        
        //    12: aload_3        
        //    13: invokestatic    gdd.g:(Ljava/util/List;)Ljava/util/List;
        //    16: putfield        gs8.k1:Ljava/util/List;
        //    19: aload_0        
        //    20: aload_2        
        //    21: putfield        gs8.l1:Lcom/twitter/util/user/UserIdentifier;
        //    24: aload_0        
        //    25: iconst_1       
        //    26: putfield        gs8.m1:Z
        //    29: return         
        //    Signature:
        //  (Landroid/content/Context;Lcom/twitter/util/user/UserIdentifier;Ljava/util/List<Ljava/lang/Long;>;Z)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).f("live_sync_request", this.m1);
        ((tqc$a)mcv).n("/1.1/contacts/destroy.json", "/");
        final JsonContactIds jsonContactIds = new JsonContactIds();
        jsonContactIds.a = this.k1;
        try {
            final ujr d = new ujr(rih.a((Object)jsonContactIds), cj6.a);
            ((yb)d).e("application/json");
            ((tqc$a)mcv).d = (vqc)d;
            return ((tqc$a)mcv).k();
        }
        catch (final IOException ex) {
            return ((tqc$a)mcv).k();
        }
    }
    
    public final asc<JsonDestroyContactResponse, kbv> g0() {
        return (asc<JsonDestroyContactResponse, kbv>)new v8g$e((Class)JsonDestroyContactResponse.class, (Class)kbv.class);
    }
    
    public final void n0(final xrc<JsonDestroyContactResponse, kbv> t) {
        final Context j1 = this.j1;
        final GlobalSchema globalSchema = (GlobalSchema)((np1)k3c.l0()).T();
        final bk6 bk6 = new bk6(j1, globalSchema, this.l1);
        final List<Long> k1 = this.k1;
        final cmq b = ((two)globalSchema).b((Class)dk6.class);
        final cxt a = ((two)globalSchema).a();
        try {
            final Iterator<Long> iterator = k1.iterator();
            while (iterator.hasNext()) {
                b.d(itl.a(new String[] { itl.c("user_id"), itl.c("remote_id") }), new Object[] { bk6.c, iterator.next() });
            }
            a.v1();
            a.close();
        }
        finally {
            if (a != null) {
                try {
                    a.close();
                }
                finally {
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
    }
}
