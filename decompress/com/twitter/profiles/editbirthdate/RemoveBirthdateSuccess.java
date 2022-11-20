// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profiles.editbirthdate;

import kotlinx.serialization.KSerializer;
import kotlin.Metadata;

@flp
@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/profiles/editbirthdate/RemoveBirthdateSuccess;", "Lcom/twitter/profiles/editbirthdate/EditBirthdateContentViewResult;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RemoveBirthdateSuccess extends EditBirthdateContentViewResult
{
    private static final qwe<KSerializer<Object>> $cachedSerializer$delegate;
    public static final int $stable;
    public static final RemoveBirthdateSuccess INSTANCE;
    
    static {
        INSTANCE = new RemoveBirthdateSuccess();
        $cachedSerializer$delegate = pps.m(2, (nsb)RemoveBirthdateSuccess$a.D0);
        $stable = 8;
    }
    
    private RemoveBirthdateSuccess() {
        super((rf8)null);
    }
    
    private final qwe get$cachedSerializer$delegate() {
        return RemoveBirthdateSuccess.$cachedSerializer$delegate;
    }
    
    public final KSerializer<RemoveBirthdateSuccess> serializer() {
        return (KSerializer<RemoveBirthdateSuccess>)this.get$cachedSerializer$delegate().getValue();
    }
}
