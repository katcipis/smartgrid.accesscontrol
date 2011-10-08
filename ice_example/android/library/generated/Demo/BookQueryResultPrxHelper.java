// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `BookQueryResultPrxHelper.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

/**
 * Interface to get query results.
 * 
 **/
public final class BookQueryResultPrxHelper extends Ice.ObjectPrxHelperBase implements BookQueryResultPrx
{
    /**
     * Destroy the query result.
     * 
     **/
    public void
    destroy()
    {
        destroy(null, false);
    }

    /**
     * Destroy the query result.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public void
    destroy(java.util.Map<String, String> __ctx)
    {
        destroy(__ctx, true);
    }

    private void
    destroy(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _BookQueryResultDel __del = (_BookQueryResultDel)__delBase;
                __del.destroy(__ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __destroy_name = "destroy";

    /**
     * Destroy the query result.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_destroy()
    {
        return begin_destroy(null, false, null);
    }

    /**
     * Destroy the query result.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_destroy(java.util.Map<String, String> __ctx)
    {
        return begin_destroy(__ctx, true, null);
    }

    /**
     * Destroy the query result.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_destroy(Ice.Callback __cb)
    {
        return begin_destroy(null, false, __cb);
    }

    /**
     * Destroy the query result.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_destroy(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_destroy(__ctx, true, __cb);
    }

    /**
     * Destroy the query result.
     * 
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_destroy(Callback_BookQueryResult_destroy __cb)
    {
        return begin_destroy(null, false, __cb);
    }

    /**
     * Destroy the query result.
     * 
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_destroy(java.util.Map<String, String> __ctx, Callback_BookQueryResult_destroy __cb)
    {
        return begin_destroy(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_destroy(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __destroy_name, __cb);
        try
        {
            __result.__prepare(__destroy_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public void end_destroy(Ice.AsyncResult __result)
    {
        __end(__result, __destroy_name);
    }

    /**
     * Get more query results.
     * 
     * @param n The maximum number of results to return.
     * 
     * @param destroyed There are no more results, and the query has
     * been destroyed.
     * 
     * @returns A sequence of up to n results.
     * 
     **/
    public java.util.List<BookDescription>
    next(int n, Ice.BooleanHolder destroyed)
    {
        return next(n, destroyed, null, false);
    }

    /**
     * Get more query results.
     * 
     * @param n The maximum number of results to return.
     * 
     * @param destroyed There are no more results, and the query has
     * been destroyed.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @returns A sequence of up to n results.
     * 
     **/
    public java.util.List<BookDescription>
    next(int n, Ice.BooleanHolder destroyed, java.util.Map<String, String> __ctx)
    {
        return next(n, destroyed, __ctx, true);
    }

    private java.util.List<BookDescription>
    next(int n, Ice.BooleanHolder destroyed, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("next");
                __delBase = __getDelegate(false);
                _BookQueryResultDel __del = (_BookQueryResultDel)__delBase;
                return __del.next(n, destroyed, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __next_name = "next";

    /**
     * Get more query results.
     * 
     * @param __cb The callback object for the operation.
     * @param n The maximum number of results to return.
     * 
     **/
    public Ice.AsyncResult begin_next(int n)
    {
        return begin_next(n, null, false, null);
    }

    /**
     * Get more query results.
     * 
     * @param __cb The callback object for the operation.
     * @param n The maximum number of results to return.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_next(int n, java.util.Map<String, String> __ctx)
    {
        return begin_next(n, __ctx, true, null);
    }

    /**
     * Get more query results.
     * 
     * @param __cb The callback object for the operation.
     * @param n The maximum number of results to return.
     * 
     **/
    public Ice.AsyncResult begin_next(int n, Ice.Callback __cb)
    {
        return begin_next(n, null, false, __cb);
    }

    /**
     * Get more query results.
     * 
     * @param __cb The callback object for the operation.
     * @param n The maximum number of results to return.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_next(int n, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_next(n, __ctx, true, __cb);
    }

    /**
     * Get more query results.
     * 
     * @param __cb The callback object for the operation.
     * @param n The maximum number of results to return.
     * 
     **/
    public Ice.AsyncResult begin_next(int n, Callback_BookQueryResult_next __cb)
    {
        return begin_next(n, null, false, __cb);
    }

    /**
     * Get more query results.
     * 
     * @param __cb The callback object for the operation.
     * @param n The maximum number of results to return.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_next(int n, java.util.Map<String, String> __ctx, Callback_BookQueryResult_next __cb)
    {
        return begin_next(n, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_next(int n, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__next_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __next_name, __cb);
        try
        {
            __result.__prepare(__next_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeInt(n);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value)s A sequence of up to n results.
     * 
     * @param destroyed There are no more results, and the query has
     * been destroyed.
     * 
     **/
    public java.util.List<BookDescription> end_next(Ice.BooleanHolder destroyed, Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __next_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
            }
        }
        java.util.List<BookDescription> __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        destroyed.value = __is.readBool();
        __ret = BookDescriptionSeqHelper.read(__is);
        __is.endReadEncaps();
        return __ret;
    }

    public static BookQueryResultPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        BookQueryResultPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (BookQueryResultPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    BookQueryResultPrxHelper __h = new BookQueryResultPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static BookQueryResultPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        BookQueryResultPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (BookQueryResultPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    BookQueryResultPrxHelper __h = new BookQueryResultPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static BookQueryResultPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        BookQueryResultPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    BookQueryResultPrxHelper __h = new BookQueryResultPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static BookQueryResultPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        BookQueryResultPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    BookQueryResultPrxHelper __h = new BookQueryResultPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static BookQueryResultPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        BookQueryResultPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (BookQueryResultPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                BookQueryResultPrxHelper __h = new BookQueryResultPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static BookQueryResultPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        BookQueryResultPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            BookQueryResultPrxHelper __h = new BookQueryResultPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Demo::BookQueryResult",
        "::Ice::Object"
    };

    public static String
    ice_staticId()
    {
        return __ids[0];
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _BookQueryResultDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _BookQueryResultDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, BookQueryResultPrx v)
    {
        __os.writeProxy(v);
    }

    public static BookQueryResultPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            BookQueryResultPrxHelper result = new BookQueryResultPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}