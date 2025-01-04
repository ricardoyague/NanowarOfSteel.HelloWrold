package it.nanowar.ofsteel.helloworld.infrastructure.rest.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.nanowar.ofsteel.helloworld.domain.service.HelloWorldService;
import it.nanowar.ofsteel.helloworld.infrastructure.rest.dto.HelloWorldDto;
import it.nanowar.ofsteel.helloworld.infrastructure.rest.mapper.HelloWorldMapper;
import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/")
public class HelloWorldController {

    HelloWorldService helloWorldService;
    HelloWorldMapper helloWorldMapper;

    @GetMapping("is-alive")
    public ResponseEntity<String> isAlive() {
        return ResponseEntity.ok("Of course, I'm alive!");
    }

//      @GetMapping("process-assets/{investorId}")
//   public ResponseEntity<String> processInvestorAssets(@PathVariable("investorId") String investorId,
//       @RequestParam(name = "date", required = false) @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate date) {

    @GetMapping("song-refrain/{foo}")
    public ResponseEntity<HelloWorldDto> songRefrain(@PathVariable("foo") Integer foo){
        // return ResponseEntity.ok(reportingService.quoteAssets(offerLetter.getAssetsCodes()).stream()
        // .map(asset -> assetMapper.toDto(asset)).toList());
        return ResponseEntity.ok(helloWorldMapper.toDto(helloWorldService.songRefrain(foo)));
    }
}
