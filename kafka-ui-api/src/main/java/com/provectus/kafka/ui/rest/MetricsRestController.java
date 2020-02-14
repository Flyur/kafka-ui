package com.provectus.kafka.ui.rest;

import com.provectus.kafka.ui.api.ClustersApi;
import com.provectus.kafka.ui.cluster.service.ClusterService;
import com.provectus.kafka.ui.model.Cluster;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clusters")
public class MetricsRestController implements ClustersApi {

    private final ClusterService clusterService;

    @GetMapping("/{clusterId}/brokers")
    public void getBrokers(@PathVariable("clusterId") String clusterId) {

    }

    @GetMapping("/{clusterId}/metrics/broker")
    public void getBrokerMetrics(@PathVariable("clusterId") String clusterId) {

    }

    @GetMapping("/{clusterId}/topics")
    public void getTopics(@PathVariable("clusterId") String clusterId) {

    }

    @GetMapping("/{clusterId}/topics/{topicId}")
    public void getTopic(@PathVariable("clusterId") String clusterId,
                         @PathVariable("topicId") String topicId) {
    }

    @PostMapping("/{clusterId}/topics")
    public void createTopic(@PathVariable("clusterId") String clusterId) {

    }

    @PutMapping("/{clusterId}/topics/{topicId}")
    public void putTopic(@PathVariable("clusterId") String clusterId,
                         @PathVariable("topicId") String topicId) {
    }

    @Override
    @GetMapping
    public Mono<ResponseEntity<Flux<Cluster>>> getClusters(ServerWebExchange exchange) {
        return clusterService.getClusters();
    }
}