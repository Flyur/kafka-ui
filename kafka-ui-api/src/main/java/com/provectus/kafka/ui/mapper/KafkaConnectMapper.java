package com.provectus.kafka.ui.mapper;

import com.provectus.kafka.ui.connect.model.ConnectorStatusConnector;
import com.provectus.kafka.ui.connect.model.ConnectorTask;
import com.provectus.kafka.ui.connect.model.NewConnector;
import com.provectus.kafka.ui.model.Connector;
import com.provectus.kafka.ui.model.ConnectorPlugin;
import com.provectus.kafka.ui.model.ConnectorPluginConfigValidationResponse;
import com.provectus.kafka.ui.model.ConnectorStatus;
import com.provectus.kafka.ui.model.Task;
import com.provectus.kafka.ui.model.TaskStatus;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KafkaConnectMapper {
  NewConnector toClient(com.provectus.kafka.ui.model.NewConnector newConnector);

  Connector fromClient(com.provectus.kafka.ui.connect.model.Connector connector);

  ConnectorStatus fromClient(ConnectorStatusConnector connectorStatus);

  Task fromClient(ConnectorTask connectorTask);

  TaskStatus fromClient(com.provectus.kafka.ui.connect.model.TaskStatus taskStatus);

  ConnectorPlugin fromClient(com.provectus.kafka.ui.connect.model.ConnectorPlugin connectorPlugin);

  ConnectorPluginConfigValidationResponse fromClient(
      com.provectus.kafka.ui.connect.model.ConnectorPluginConfigValidationResponse
          connectorPluginConfigValidationResponse);
}
