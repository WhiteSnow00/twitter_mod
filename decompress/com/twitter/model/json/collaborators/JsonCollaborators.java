// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.collaborators;

import java.util.Collection;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCollaborators extends tih<to4>
{
    @JsonField
    public List<ro4> a;
    @JsonField
    public JsonCollaborators.JsonCollaborators$CollabInvitation b;
    @JsonField
    public JsonCollaborators.JsonCollaborators$CollabTweet c;
    @JsonField
    public List<qgv> d;
    
    public static List<ro4> t(final List<qgv> p0, final so4 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    j$/util/Collection$_EL.stream:(Ljava/util/Collection;)Lj$/util/stream/Stream;
        //     4: new             Ltde;
        //     7: dup            
        //     8: invokespecial   tde.<init>:()V
        //    11: invokeinterface j$/util/stream/Stream.map:(Lj$/util/function/Function;)Lj$/util/stream/Stream;
        //    16: invokestatic    j$/util/stream/Collectors.toList:()Lj$/util/stream/Collector;
        //    19: invokeinterface j$/util/stream/Stream.collect:(Lj$/util/stream/Collector;)Ljava/lang/Object;
        //    24: checkcast       Ljava/util/List;
        //    27: areturn        
        //    Signature:
        //  (Ljava/util/List<Lqgv;>;Lso4;)Ljava/util/List<Lro4;>;
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
    
    @Override
    public final Object s() {
        final ArrayList list = new ArrayList();
        final ArrayList a = this.a;
        if (a != null) {
            list.addAll(a);
        }
        else {
            final JsonCollaborators.JsonCollaborators$CollabInvitation b = this.b;
            if (b != null) {
                final ArrayList a2 = b.a;
                if (a2 != null) {
                    list.addAll(a2);
                }
            }
        }
        final ArrayList d = this.d;
        if (d != null) {
            list.addAll(t((List)d));
        }
        else {
            final JsonCollaborators.JsonCollaborators$CollabTweet c = this.c;
            if (c != null) {
                final ArrayList a3 = c.a;
                if (a3 != null) {
                    list.addAll(t((List)a3));
                }
            }
        }
        Object o;
        if (list.isEmpty()) {
            o = null;
        }
        else {
            o = new to4((List)list);
        }
        return o;
    }
}
