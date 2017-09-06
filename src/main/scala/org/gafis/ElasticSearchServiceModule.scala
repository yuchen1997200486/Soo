package org.gafis

import gafis.internal.elasticsearch.sync.SyncCronServiceImpl
import gafis.service.elasticsearch.sync.SyncCronService
import org.apache.tapestry5.ioc.ServiceBinder
import org.gafis.internal.DatabaseServiceImpl
import org.gafis.internal.elasticsearch.{DataAccessServiceImpl, ManageIndexServiceImpl}
import org.gafis.service.DatabaseService
import org.gafis.service.elasticsearch.{DataAccessService, ManageIndexService}

/**
  * Created by yuchen on 2017/8/26.
  */
object ElasticSearchServiceModule {
  def bind(binder:ServiceBinder): Unit ={
    binder.bind(classOf[DatabaseService],classOf[DatabaseServiceImpl])
    binder.bind(classOf[DataAccessService],classOf[DataAccessServiceImpl])
    binder.bind(classOf[ManageIndexService],classOf[ManageIndexServiceImpl])
    binder.bind(classOf[SyncCronService],classOf[SyncCronServiceImpl]).eagerLoad
  }
}
